
import java.util.Scanner;


/**
 *
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lahiesimies l = new Lahiesimies();
        YksikonPaallikko y = new YksikonPaallikko();
        Toimitusjohtaja t = new Toimitusjohtaja();
        
        l.setSuccessor(y);
        y.setSuccessor(t);
        
        System.out.println("Syötä palkka:");
        Scanner s = new Scanner(System.in);
        int palkka = Integer.parseInt(s.nextLine());
        
        l.processRequest(palkka);
    }    
}
