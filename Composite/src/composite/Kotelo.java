package composite;

/**
 *
 * @author sonja
 */
public class Kotelo implements Laiteosa {
    private int hinta;

    public Kotelo() {
        this.hinta = 50;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
}
