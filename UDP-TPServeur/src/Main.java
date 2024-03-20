import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
        //Client abdelhak = new Client("127.0.0.1",2000);
        Serveur adam = new Serveur("127.0.0.1",3000);
        /*String msg = "";

        Scanner scanner = new Scanner(System.in);

        msg = scanner.nextLine();

        abdelhak.envoyer(msg,msg.length(),adam.ip, adam.port);
*/
        byte[] msg_recu = new byte[1024];
        adam.recevoir(msg_recu, 1024);

        System.out.println("Message reçu : "+new String(msg_recu,0, adam.dp.getLength()));

    }
}