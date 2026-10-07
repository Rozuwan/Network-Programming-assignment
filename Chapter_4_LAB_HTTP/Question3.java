import java.net.*;
import java.util.*;

public class Question3 {

    public static void main(String[] args) {
        CookieManager manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(manager);

        String resource = "http://www.google.com/";

        try {
            URL url = new URL(resource);
            URLConnection connection = url.openConnection();
            connection.setUseCaches(false);
            connection.getInputStream().close();
            System.out.println("Response received from " + resource);
        } catch (Exception e) {
            System.out.println("Could not connect: " + e.getMessage());
        }

        CookieStore store = manager.getCookieStore();
        List<HttpCookie> cookies = store.getCookies();

        System.out.println("Total cookies stored: " + cookies.size());
        for (HttpCookie cookie : cookies) {
            System.out.println("Domain : " + cookie.getDomain()
                    + "   Name : " + cookie.getName());
        }
    }
}
