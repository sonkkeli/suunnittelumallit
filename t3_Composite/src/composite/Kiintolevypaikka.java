package composite;

/**
 *
 * @author sonja
 */
public class Kiintolevypaikka implements Laiteosa{
    private int hinta;

    public Kiintolevypaikka() {
        this.hinta = 10;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
    
}
