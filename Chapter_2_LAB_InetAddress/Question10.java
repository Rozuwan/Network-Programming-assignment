import java.net.*;
import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();

                System.out.println("Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());

                Enumeration<InetAddress> addresses = ni.getInetAddresses();

                while (addresses.hasMoreElements()) {
                    InetAddress ia = addresses.nextElement();
                    System.out.println("Address: " + ia);
                }

                System.out.println();
            }
        } catch (SocketException e) {
            System.out.println("Socket Exception: " + e.getMessage());
        }
    }
}
