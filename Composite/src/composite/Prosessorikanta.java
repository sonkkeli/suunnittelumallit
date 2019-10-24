package composite;

/**
 *
 * @author sonja
 */
public class Prosessorikanta implements Laiteosa {
    private int hinta;    

    public Prosessorikanta() {
        this.hinta = 35;
    }

    @Override
    public int getHinta() {
        return hinta;
    }  
}
