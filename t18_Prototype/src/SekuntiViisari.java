import java.util.*;

/**
 *
 * @author sonja
 */
class SekuntiViisari extends Viisari{
    public SekuntiViisari(Viisari v) {
        super(60, v);
        aika = GregorianCalendar.getInstance().get(Calendar.SECOND);
    }
}
