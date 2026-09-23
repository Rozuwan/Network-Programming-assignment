import java.net.*;

public class Question3 {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName(args[0]);
            System.out.println(ia.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        }
    }
}
