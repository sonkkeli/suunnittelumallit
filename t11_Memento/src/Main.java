
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
        Arvuuttaja a = new Arvuuttaja();
        Pelaaja p = new Pelaaja("sonja");
        p.setState(a.liityPeliin(p));        
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna arvaus (välillä 0-10): ");
        int luku = Integer.parseInt(lukija.nextLine());        
        System.out.println(a.arvaa(p, luku));
    }    
}
