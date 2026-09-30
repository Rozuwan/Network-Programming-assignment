import java.io.*;
import java.net.*;

public class Question8 {

    static class QueryString {
        private StringBuilder query = new StringBuilder();

        public void add(String name, String value) {
            try {
                if (query.length() > 0) {
                    query.append('&');
                }
                query.append(URLEncoder.encode(name, "UTF-8"));
                query.append('=');
                query.append(URLEncoder.encode(value, "UTF-8"));
            } catch (UnsupportedEncodingException ex) {
                System.err.println(ex);
            }
        }

        public String toString() {
            return query.toString();
        }
    }

    public static void main(String[] args) {
        String target = "computer";
        QueryString query = new QueryString();
        query.add("q", target);
        try {
            URL u = new URL("http://www.google.com/search?" + query);
            try (InputStream in = new BufferedInputStream(u.openStream())) {
                InputStreamReader theHTML = new InputStreamReader(in);
                int c;
                while ((c = theHTML.read()) != -1) {
                    System.out.print((char) c);
                }
            }
        } catch (MalformedURLException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
