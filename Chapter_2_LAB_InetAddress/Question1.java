import java.net.*;

public class Question1 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.pascalcollege.edu.np");
            System.out.println(address);
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        }
    }
}
