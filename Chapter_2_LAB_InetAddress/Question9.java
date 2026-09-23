import java.net.*;
import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println(ni);
            }
        } catch (SocketException e) {
            System.out.println("Socket Exception: " + e.getMessage());
        }
    }
}
