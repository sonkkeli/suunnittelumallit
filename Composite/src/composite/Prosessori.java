package composite;

/**
 *
 * @author sonja
 */
public class Prosessori implements Laiteosa {
    private int hinta;

    public Prosessori() {
        this.hinta = 150;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
