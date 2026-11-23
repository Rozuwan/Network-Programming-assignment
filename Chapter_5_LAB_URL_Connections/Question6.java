import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Date;

public class Question6 {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL("https://www.oreilly.com");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");

            System.out.println(url + " was last modified at "
                    + new Date(connection.getLastModified()));
        } catch (UnknownHostException e) {
            System.out.println("Connection failed: host not found (" + e.getMessage() + ").");
            System.out.println("Check the URL or your network connection.");
        } catch (IOException e) {
            System.out.println("Connection failed: could not retrieve the last-modified date.");
            System.out.println("Reason: " + (e.getMessage() != null ? e.getMessage() : e.toString()));
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
