
/**
 *
 * @author sonja
 */
public class Toimitusjohtaja extends Power{
    private final double ALLOWABLE = 1.05 * BASE;

    @Override
    public void processRequest(double palkka) {        
        if (palkka >= ALLOWABLE) {
            System.out.println("Toimitusjohtaja hyväksyy palkankorotuksen " + palkka);
        } else if (successor != null) {
            successor.processRequest(palkka);
        }
    }    
}
