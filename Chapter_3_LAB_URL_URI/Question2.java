import java.net.*;

public class Question2 {
    public static void main(String[] args) {
        String[] protocols = { "http", "https", "ftp", "file", "telnet", "magnet", "not-a-protocol" };

        for (int i = 0; i < protocols.length; i++) {
            try {
                URL u = new URL(protocols[i] + "://www.example.com/index.html");
                System.out.println(protocols[i] + " is supported: " + u);
            } catch (MalformedURLException ex) {
                System.out.println(protocols[i] + " is not supported: " + ex.getMessage());
            }
        }
    }
}
