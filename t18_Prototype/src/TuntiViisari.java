import java.util.*;

/**
 *
 * @author sonja
 */
class TuntiViisari extends Viisari{
    public TuntiViisari(Viisari v) {
        super(24, v);
        aika = GregorianCalendar.getInstance().get(Calendar.HOUR);
    }
}
