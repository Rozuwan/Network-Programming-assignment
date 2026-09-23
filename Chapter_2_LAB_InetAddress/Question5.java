import java.net.*;

public class Question5 {
    public static void main(String[] args) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName(args[0]);

            for (int i = 0; i < addresses.length; i++) {
                byte[] address = addresses[i].getAddress();

                if (address.length == 4) {
                    System.out.println("IPv4: " + addresses[i].getHostAddress());
                } else if (address.length == 16) {
                    System.out.println("IPv6: " + addresses[i].getHostAddress());
                } else {
                    System.out.println("Unknown: " + addresses[i].getHostAddress());
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        }
    }
}
