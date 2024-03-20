import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {

    InetAddress ip;
    int port;
    DatagramSocket ds;

    public Client(String ip, int port) {
        try {
            this.ip = InetAddress.getByName(ip);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        this.port = port;
        try {
            ds = new DatagramSocket(port,this.ip);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public void envoyer(InetAddress ip, int port){

        String msg = "";
        Scanner scanner = new Scanner(System.in);
        msg = scanner.nextLine();

        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),ip,port);
        try {
            ds.send(dp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recevoir(byte[] data,int taille,InetAddress ip, int port){
        DatagramPacket dp = new DatagramPacket(data,taille,ip,port);
        try {
            ds.receive(dp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}