package composite;

/**
 *
 * @author sonja
 */
public class Naytonohjain implements Laiteosa {
    private int hinta;

    public Naytonohjain() {
        this.hinta = 200;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
