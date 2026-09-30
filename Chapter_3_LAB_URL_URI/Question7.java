import java.io.*;
import java.net.*;

public class Question7 {
    public static void main(String[] args) {
        try {
            String original = "This string has spaces & asterisks * and special chars = ? / #";
            String encoded = URLEncoder.encode(original, "UTF-8");
            System.out.println("Original : " + original);
            System.out.println("Encoded  : " + encoded);
            String decoded = URLDecoder.decode(encoded, "UTF-8");
            System.out.println("Decoded  : " + decoded);
            System.out.println();

            String query = URLEncoder.encode("https://www.google.com/search?hl=en&as_q=Java&as_epq=I/O",
                    "UTF-8");
            System.out.println("Encoded URL : " + query);
            System.out.println("Decoded URL : " + URLDecoder.decode(query, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            System.err.println(ex);
        }
    }
}
