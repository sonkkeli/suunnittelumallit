import java.util.*;

/**
 *
 * @author sonja
 */
class MinuuttiViisari extends Viisari{
    public MinuuttiViisari(Viisari v) {
        super(60, v);
        aika = GregorianCalendar.getInstance().get(Calendar.MINUTE);
    }
}
