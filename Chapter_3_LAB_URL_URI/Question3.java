import java.io.*;
import java.net.*;

public class Question3 {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.example.com/");
            InputStream in = u.openStream();
            int c;
            while ((c = in.read()) != -1) {
                System.out.write(c);
            }
            in.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
