import java.io.*;
import java.net.*;

public class Question6 {
    public static void main(String[] args) {
        try {
            String location = "http://www.example.com/";
            URL u = new URL(location);
            Object o = u.getContent();
            System.out.println("I got a " + o.getClass().getName());
        } catch (MalformedURLException ex) {
            System.err.println("This is not a parseable URL");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
