import java.net.*;

public class Question4 {
    public static void main(String[] args) {
        try {
            InetAddress me = InetAddress.getLocalHost();

            String hostname = me.getHostName();
            String ip = me.getHostAddress();

            System.out.println("Host Name: " + hostname);
            System.out.println("IP Address: " + ip);
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        }
    }
}
