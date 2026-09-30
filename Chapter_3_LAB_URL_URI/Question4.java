import java.net.*;

public class Question4 {
    public static void main(String[] args) {
        try {
            URI absolute = new URI("http://www.example.com/");
            URI relative = new URI("images/logo.png");
            URI resolved = absolute.resolve(relative);
            System.out.println("The absolute URI is " + absolute);
            System.out.println("The relative URI is " + relative);
            System.out.println("The resolved URI is " + resolved);

            URI top = new URI("http://www.example.com/javafaq/books/");
            URI resolved2 = top.resolve("jnp3/examples/07/index.html");
            System.out.println("The base URI is " + top);
            System.out.println("The resolved URI is " + resolved2);
        } catch (URISyntaxException ex) {
            System.err.println("This does not seem to be a URI.");
        }
    }
}
