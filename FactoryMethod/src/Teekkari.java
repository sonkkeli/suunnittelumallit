
/**
 *
 * @author sonja
 */
public class Teekkari extends AterioivaOtus{

    @Override
    public Juoma createJuoma() {
        return new KolmenTahdenJallu();
    }
    
}
