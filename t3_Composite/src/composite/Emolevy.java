package composite;

import java.util.ArrayList;

/**
 *
 * @author sonja
 */
public class Emolevy implements Laiteosa {
    private ArrayList<Laiteosa> osat;

    public Emolevy() {
        this.osat = new ArrayList<>();
        osat.add(new Piirisarja());
        osat.add(new Prosessorikanta());
        osat.add(new BIOS());
        osat.add(new Valimuisti());
    }

    @Override
    public int getHinta() {
        int sum = 0;
        for (Laiteosa l : osat){
            sum += l.getHinta();
        }
        return sum;
    }
}
