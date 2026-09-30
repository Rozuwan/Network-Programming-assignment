import java.net.*;

public class Question5 {
    public static void main(String[] args) {
        String[] uris = {
            "tel:+1-800-9988-9938",
            "http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc",
            "urn:isbn:1-565-92870-9",
            "images/logo.png"
        };

        for (int i = 0; i < uris.length; i++) {
            try {
                URI u = new URI(uris[i]);
                System.out.println(uris[i]);
                System.out.println("Is absolute: " + u.isAbsolute());
                if (u.isOpaque()) {
                    System.out.println("This is an opaque URI.");
                    System.out.println("The scheme is " + u.getScheme());
                    System.out.println("The scheme specific part is " + u.getSchemeSpecificPart());
                    System.out.println("The fragment ID is " + u.getFragment());
                } else {
                    System.out.println("This is a hierarchical URI.");
                    System.out.println("The scheme is " + u.getScheme());
                    System.out.println("The authority is " + u.getAuthority());
                    System.out.println("The host is " + u.getHost());
                    System.out.println("The user info is " + u.getUserInfo());
                    System.out.println("The port is " + u.getPort());
                    System.out.println("The path is " + u.getPath());
                    System.out.println("The query string is " + u.getQuery());
                    System.out.println("The fragment ID is " + u.getFragment());
                }
                System.out.println();
            } catch (URISyntaxException ex) {
                System.err.println("This does not seem to be a URI.");
            }
        }
    }
}
