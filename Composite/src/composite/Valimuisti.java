package composite;

/**
 *
 * @author sonja
 */
public class Valimuisti implements Laiteosa{
    private int hinta;

    public Valimuisti() {
        this.hinta = 30;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
    
}
