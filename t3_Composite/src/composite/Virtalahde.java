package composite;

/**
 *
 * @author sonja
 */
public class Virtalahde  implements Laiteosa{
    private int hinta;

    public Virtalahde() {
        this.hinta = 10;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
    
}
