import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Question5 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://fohss.tu.edu.np");
            URLConnection connection = url.openConnection();
            System.out.println(connection.getURL());
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
