
/**
 *
 * @author sonja
 */
public class Lahiesimies extends Power {
    private final double ALLOWABLE = 1.02 * BASE;

    @Override
    public void processRequest(double palkka) {
        if (palkka <= ALLOWABLE) {
        System.out.println("Lähiesimies hyväksyy palkankorotuksen " + palkka);
        } else if (successor != null) {
            successor.processRequest(palkka);
        }
    }   
}
