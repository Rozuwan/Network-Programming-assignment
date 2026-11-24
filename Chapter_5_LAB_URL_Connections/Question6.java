import java.io.*;
import java.net.*;
import java.util.Date;

public class Question6 {
    public static void main(String[] args) {
        String resource = "https://www.oreilly.com";

        try {
            URL u = new URL(resource);
            HttpURLConnection http = (HttpURLConnection) u.openConnection();

            http.setRequestMethod("HEAD");

            System.out.println(u + " was last modified at "
                    + new Date(http.getLastModified()));

            http.disconnect();

        } catch (MalformedURLException ex) {
            System.err.println(resource + " is not a URL I understand");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
