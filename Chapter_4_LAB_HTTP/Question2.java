import java.net.*;
import java.util.*;

public class Question2 {

    static void display(CookieStore store, String title) {
        System.out.println("--- " + title + " ---");
        List<HttpCookie> cookies = store.getCookies();
        if (cookies.isEmpty()) {
            System.out.println("Cookie store is empty.");
        } else {
            for (HttpCookie c : cookies) {
                System.out.println("Name=" + c.getName()
                        + ", Value=" + c.getValue()
                        + ", Domain=" + c.getDomain()
                        + ", Path=" + c.getPath());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CookieManager manager = new CookieManager();
        CookieStore store = manager.getCookieStore();
        URI uri = URI.create("http://spm.com.np/");

        display(store, "Initial CookieStore");

        HttpCookie c1 = new HttpCookie("JSESSIONID", "ABC123");
        c1.setDomain("spm.com.np");
        c1.setPath("/");

        HttpCookie c2 = new HttpCookie("USER", "ram");
        c2.setDomain("spm.com.np");
        c2.setPath("/");

        HttpCookie c3 = new HttpCookie("THEME", "dark");
        c3.setDomain("spm.com.np");
        c3.setPath("/");

        store.add(uri, c1);
        store.add(uri, c2);
        store.add(uri, c3);
        display(store, "After add() of 3 cookies");

        store.remove(uri, c2);
        display(store, "After remove() of USER cookie");

        store.removeAll();
        display(store, "After removeAll()");
    }
}
