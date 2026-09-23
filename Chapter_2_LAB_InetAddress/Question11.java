import java.net.*;
import java.io.*;

public class Question11 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName(args[0]);

            if (address.isReachable(5000)) {
                System.out.println("The system is reachable.");
            } else {
                System.out.println("The system is not reachable.");
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
