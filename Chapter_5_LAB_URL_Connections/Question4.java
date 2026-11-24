import java.io.*;
import java.net.*;

public class Question4 {
    public static void main(String[] args) {
        String resource = "https://www.oreilly.com";
        String method = args.length > 0 ? args[0].toUpperCase() : "GET";

        try {
            URL u = new URL(resource);
            HttpURLConnection http = (HttpURLConnection) u.openConnection();

            http.setRequestMethod(method);

            System.out.println("Request Method: " + http.getRequestMethod());
            System.out.println("Response Code: " + http.getResponseCode());
            System.out.println("Response Message: " + http.getResponseMessage());

            http.disconnect();

        } catch (MalformedURLException ex) {
            System.err.println(resource + " is not a URL I understand.");
        } catch (ProtocolException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
