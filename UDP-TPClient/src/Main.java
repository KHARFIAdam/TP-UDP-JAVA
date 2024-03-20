import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws UnknownHostException {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
        Client abdelhak = new Client("127.0.0.1",2000);

        abdelhak.envoyer(InetAddress.getByName("127.0.0.1"),3000);

        /*byte[] msg_recu = new byte[msg.length()];
        adam.recevoir(msg_recu, msg_recu.length, abdelhak.ip, abdelhak.port);

        System.out.println("Mesage reçu : "+new String(msg_recu,0, msg_recu.length));
*/
    }
}