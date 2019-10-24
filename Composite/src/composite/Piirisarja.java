package composite;

import java.util.ArrayList;

/**
 *
 * @author sonja
 */
public class Piirisarja implements Laiteosa {
    private int hinta;    

    public Piirisarja() {
        this.hinta = 125;
    }

    @Override
    public int getHinta() {
        return hinta;
    }    
}
