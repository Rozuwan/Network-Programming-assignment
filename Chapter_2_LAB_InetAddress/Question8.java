import java.net.*;

public class Question8 {
    public static void main(String[] args) {
        try {
            InetAddress first = InetAddress.getByName("www.nepalstock.com.np");
            InetAddress second = InetAddress.getByName("nepalstock.com");

            if (first.equals(second)) {
                System.out.println("The two addresses are the same.");
            } else {
                System.out.println("The two addresses are not the same.");
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        }
    }
}
