import java.net.*;

public class Question12 {

    public static final String BLACKHOLE = "sbl.spamhaus.org";

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (isSpammer(args[i])) {
                System.out.println(args[i] + " is a known spammer.");
            } else {
                System.out.println(args[i] + " appears legitimate.");
            }
        }
    }

    private static boolean isSpammer(String arg) {
        try {
            InetAddress address = InetAddress.getByName(arg);
            byte[] quad = address.getAddress();

            StringBuilder query = new StringBuilder();
            for (int i = quad.length - 1; i >= 0; i--) {
                int octet = quad[i];
                int unsignedByte = octet < 0 ? octet + 256 : octet;
                query.append(unsignedByte).append('.');
            }
            query.append(BLACKHOLE);

            InetAddress.getByName(query.toString());
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }
}
