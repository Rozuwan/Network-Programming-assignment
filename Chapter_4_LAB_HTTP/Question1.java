import java.net.*;

public class Question1 {

    static class GovCookiePolicy implements CookiePolicy {
        public boolean shouldAccept(URI uri, HttpCookie cookie) {
            String host = (uri != null && uri.getHost() != null)
                    ? uri.getHost().toLowerCase() : "";
            String domain = (cookie.getDomain() != null)
                    ? cookie.getDomain().toLowerCase() : "";

            boolean govHost = host.endsWith(".gov") || host.equals("gov");
            boolean govDomain = domain.endsWith(".gov") || domain.equals(".gov")
                    || domain.equals("gov");

            if (govHost || govDomain) {
                return false;   // block cookies from .gov domains
            }
            return true;        // allow cookies from all other domains
        }
    }

    public static void main(String[] args) throws URISyntaxException {
        CookiePolicy policy = new GovCookiePolicy();

        CookieManager manager = new CookieManager(null, policy);
        CookieHandler.setDefault(manager);

        URI govUri = new URI("http://www.whitehouse.gov/");
        HttpCookie govCookie = new HttpCookie("GOVSESSION", "12345");
        govCookie.setDomain("www.whitehouse.gov");

        URI comUri = new URI("http://spm.com.np/");
        HttpCookie comCookie = new HttpCookie("JSESSIONID", "ABC123");
        comCookie.setDomain("spm.com.np");

        System.out.println("CookieManager installed as default : "
                + (CookieHandler.getDefault() instanceof CookieManager));
        System.out.println("URI        : " + govUri);
        System.out.println("Cookie     : " + govCookie.getName()
                + " (domain " + govCookie.getDomain() + ")");
        System.out.println("Accepted?  : " + policy.shouldAccept(govUri, govCookie));
        System.out.println();
        System.out.println("URI        : " + comUri);
        System.out.println("Cookie     : " + comCookie.getName()
                + " (domain " + comCookie.getDomain() + ")");
        System.out.println("Accepted?  : " + policy.shouldAccept(comUri, comCookie));
    }
}
