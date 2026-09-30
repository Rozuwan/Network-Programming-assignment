
import java.io.*;
import java.net.*;

public class Question8 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                "https://httpbin.org/get?name=Java&course=Networking"
            );

            HttpURLConnection con =
                (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

            con.disconnect();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}