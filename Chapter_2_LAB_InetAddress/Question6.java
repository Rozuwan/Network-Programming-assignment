import java.net.*;

public class Question6 {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName(args[0]);
            byte[] address = ia.getAddress();

            if (address.length == 4) {
                System.out.println("IPv4 address");
            } else if (address.length == 16) {
                System.out.println("IPv6 address");
            } else {
                System.out.println("Unknown address type");
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        }
    }
}
