import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.UnknownHostException;

public class Question4 {
    public static void main(String[] args) {
        String method = "GET";
        if (args.length > 0) {
            method = args[0].toUpperCase();
        }

        HttpURLConnection connection = null;
        try {
            URL url = new URL("https://www.oreilly.com");

            connection = (HttpURLConnection) url.openConnection();

            switch (method) {
                case "GET":
                case "POST":
                case "HEAD":
                case "PUT":
                case "DELETE":
                case "OPTIONS":
                case "TRACE":
                    connection.setRequestMethod(method);
                    break;
                default:
                    System.out.println("Unsupported request method: " + method);
                    System.out.println("Supported methods: GET, POST, HEAD, PUT, DELETE, OPTIONS, TRACE");
                    return;
            }

            connection.connect();

            int responseCode = connection.getResponseCode();
            String responseMessage = connection.getResponseMessage();

            System.out.println("Request Method: " + connection.getRequestMethod());
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response Message: "
                    + (responseMessage != null ? responseMessage : "Not provided by server"));
        } catch (ProtocolException e) {
            System.out.println("Unsupported request method: " + method);
            System.out.println("Supported methods: GET, POST, HEAD, PUT, DELETE, OPTIONS, TRACE");
        } catch (UnknownHostException e) {
            System.out.println("Connection failed: host not found (" + e.getMessage() + ").");
            System.out.println("Check the URL or your network connection.");
        } catch (IOException e) {
            System.out.println("Connection failed: could not complete the HTTP request.");
            System.out.println("Reason: " + (e.getMessage() != null ? e.getMessage() : e.toString()));
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
