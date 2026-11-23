import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Question3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.oreilly.com");
            URLConnection connection = url.openConnection();
            connection.connect();

            int n = 1;
            while (true) {
                String key = connection.getHeaderFieldKey(n);
                String value = connection.getHeaderField(n);

                if (key == null || value == null) {
                    break;
                }

                System.out.println(key + ": " + value);
                n++;
            }
        } catch (UnknownHostException e) {
            System.out.println("Connection failed: host not found (" + e.getMessage() + ").");
            System.out.println("Check the URL or your network connection.");
        } catch (IOException e) {
            System.out.println("Connection failed: could not read the HTTP header.");
            System.out.println("Reason: " + (e.getMessage() != null ? e.getMessage() : e.toString()));
        }
    }
}
