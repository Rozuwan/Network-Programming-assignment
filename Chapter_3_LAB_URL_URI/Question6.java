
import java.io.*;
import java.net.*;

public class Question6 {
    public static void main(String[] args) {
        String urlString = "https://example.com/";

        try {
            URL url = new URL(urlString);

            try (InputStream in = url.openStream();
                 FileOutputStream out =
                     new FileOutputStream("downloaded.html")) {

                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }

                System.out.println("Object downloaded successfully.");
                System.out.println("Saved as downloaded.html");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}