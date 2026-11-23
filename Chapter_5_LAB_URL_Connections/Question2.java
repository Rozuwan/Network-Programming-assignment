import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;

public class Question2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.oreilly.com");
            URLConnection connection = url.openConnection();
            connection.connect();

            String contentType = connection.getContentType();
            if (contentType != null) {
                System.out.println("Content-type: " + contentType);
            }

            String contentEncoding = connection.getContentEncoding();
            if (contentEncoding != null) {
                System.out.println("Content-encoding: " + contentEncoding);
            }

            long date = connection.getDate();
            if (date != 0) {
                System.out.println("Date: " + new Date(date));
            }

            long lastModified = connection.getLastModified();
            if (lastModified != 0) {
                System.out.println("Last modified: " + new Date(lastModified));
            }

            long expiration = connection.getExpiration();
            if (expiration != 0) {
                System.out.println("Expiration date: " + new Date(expiration));
            }

            int contentLength = connection.getContentLength();
            if (contentLength != -1) {
                System.out.println("Content-length: " + contentLength);
            }
        } catch (UnknownHostException e) {
            System.out.println("Connection failed: host not found (" + e.getMessage() + ").");
            System.out.println("Check the URL or your network connection.");
        } catch (IOException e) {
            System.out.println("Connection failed: could not read HTTP header fields.");
            System.out.println("Reason: " + (e.getMessage() != null ? e.getMessage() : e.toString()));
        }
    }
}
