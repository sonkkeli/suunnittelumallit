package composite;

/**
 *
 * @author sonja
 */
public class Tuuletin implements Laiteosa{
    private int hinta;

    public Tuuletin() {
        this.hinta = 20;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
