import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Question1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.oreilly.com");
            URLConnection connection = url.openConnection();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Download failed: host not found (" + e.getMessage() + ").");
            System.out.println("Check the URL or your network connection.");
        } catch (IOException e) {
            System.out.println("Download failed: could not download the web page.");
            System.out.println("Reason: " + (e.getMessage() != null ? e.getMessage() : e.toString()));
        }
    }
}
