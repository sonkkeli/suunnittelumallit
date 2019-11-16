
/**
 *
 * @author sonja
 */
public class YksikonPaallikko extends Power {
    private final double ALLOWABLE_MIN = 1.02 * BASE;
    private final double ALLOWABLE_MAX = 1.05 * BASE;

    @Override
    public void processRequest(double palkka) {
        if (palkka <= ALLOWABLE_MAX && palkka > ALLOWABLE_MIN) {
        System.out.println("Yksikönpäällikkö hyväksyy palkankorotuksen " + palkka);
        } else if (successor != null) {
            successor.processRequest(palkka);
        }
    }   
}
