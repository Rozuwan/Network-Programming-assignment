import java.net.*;

public class Question2 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        }
    }
}
