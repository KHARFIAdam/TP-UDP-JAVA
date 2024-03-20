import java.net.DatagramSocket;
import java.net.SocketException;

public class ScannerPortsUDP {

    public static void scannerPorts(int port1,int port2){
        for(int i = port1 ; i <= port2 ; i++){
            try {
                DatagramSocket datagramSocket = new DatagramSocket(i);
                //System.out.println("Le port "+i+" est libre");
            } catch (SocketException e) {
                System.out.println("Le port "+i+" est occupé");
            }
        }




    }

}