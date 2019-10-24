package composite;

/**
 *
 * @author sonja
 */
public class Verkkokortti implements Laiteosa {
    private int hinta;

    public Verkkokortti() {
        this.hinta = 30;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
