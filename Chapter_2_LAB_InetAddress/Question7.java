import java.net.*;

public class Question7 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName(args[0]);

            if (address.isAnyLocalAddress()) {
                System.out.println("wildcard address");
            }

            if (address.isLoopbackAddress()) {
                System.out.println("loopback address");
            }

            if (address.isLinkLocalAddress()) {
                System.out.println("link-local address");
            } else if (address.isSiteLocalAddress()) {
                System.out.println("site-local address");
            } else {
                System.out.println("global address");
            }

            if (address.isMulticastAddress()) {
                if (address.isMCGlobal()) {
                    System.out.println("global multicast address");
                } else if (address.isMCOrgLocal()) {
                    System.out.println("organization-wide multicast address");
                } else if (address.isMCSiteLocal()) {
                    System.out.println("site-wide multicast address");
                } else if (address.isMCLinkLocal()) {
                    System.out.println("subnet-wide multicast address");
                } else if (address.isMCNodeLocal()) {
                    System.out.println("interface-local multicast address");
                } else {
                    System.out.println("unknown multicast address type");
                }
            } else {
                System.out.println("unicast address");
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        }
    }
}
