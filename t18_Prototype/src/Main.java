import java.util.logging.*;

/**
 *
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Kello k1 = new Kello();
            Kello k2 = k1.clone();            
            k2.tick();
            k2.tick();
            k2.tick();            
            System.out.println("Kellon aika: " + k1.getAika());
            System.out.println("Kloonin aika: " + k2.getAika());
            
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Kello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
