package composite;

/**
 *
 * @author sonja
 */
public class Emolevy implements Laiteosa {
    private int hinta;

    public Emolevy() {
        this.hinta = 250;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
