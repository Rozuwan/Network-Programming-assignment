import java.io.*;
import java.net.*;

public class Question5 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://hafoss.edu.np");
            URLConnection uc = u.openConnection();

            System.out.println(uc.getURL());

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
