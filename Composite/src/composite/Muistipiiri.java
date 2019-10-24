package composite;

/**
 *
 * @author sonja
 */
public class Muistipiiri implements Laiteosa {
    private int hinta;

    public Muistipiiri() {
        this.hinta = 70;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
