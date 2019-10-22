
/**
 *
 * @author sonja
 */
public class Siivooja extends AterioivaOtus{

    @Override
    public Juoma createJuoma() {
        return new Vesi();
    }    
}
