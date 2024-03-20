import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class PortScanner {

    public static void main(String[] args) {
        int startPort = 0; // Port de départ du scan
        int endPort = 123;   // Port de fin du scan

        scanUDPPorts(startPort, endPort);
    }

    public static void scanUDPPorts(int startPort, int endPort) {
        System.out.println("Scan des ports UDP " + startPort + " à " + endPort + "...");

        for (int port = startPort; port <= endPort; port++) {
            try {
                DatagramSocket socket = new DatagramSocket(null);
                socket.setReuseAddress(false);
                socket.bind(new InetSocketAddress(port));
                socket.close();
                System.out.println("Port " + port + " est ouvert");
            } catch (Exception e) {
                System.out.println("Port " + port + " est fermé");
            }
        }
    }
}
