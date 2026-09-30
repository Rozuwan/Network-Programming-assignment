import java.net.*;

public class Question1 {
    public static void main(String[] args) {
        try {
            String location = "http://www.ibiblio.org/nywc/compositions.phtml?category=Piano";
            URL u = new URL(location);
            System.out.println("The URL is " + u);
            System.out.println("The Authority is " + u.getAuthority());
            System.out.println("The Default port is " + u.getDefaultPort());
            System.out.println("The scheme is " + u.getProtocol());
            System.out.println("The user info is " + u.getUserInfo());

            String host = u.getHost();
            if (host != null) {
                int atSign = host.indexOf('@');
                if (atSign != -1) {
                    host = host.substring(atSign + 1);
                }
                System.out.println("The host is " + host);
            } else {
                System.out.println("The host is null.");
            }

            System.out.println("The port is " + u.getPort());
            System.out.println("The path is " + u.getPath());
            System.out.println("The ref is " + u.getRef());
            System.out.println("The query string is " + u.getQuery());
        } catch (MalformedURLException ex) {
            System.err.println(ex.toString());
        }
    }
}
