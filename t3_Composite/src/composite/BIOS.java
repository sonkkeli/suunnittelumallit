package composite;

/**
 *
 * @author sonja
 */
public class BIOS implements Laiteosa{
    private int hinta;

    public BIOS() {
        this.hinta =40;
    }

    @Override
    public int getHinta() {
        return hinta;
    }
    
}
