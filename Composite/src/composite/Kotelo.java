package composite;

import java.util.ArrayList;

/**
 *
 * @author sonja
 */
public class Kotelo implements Laiteosa {
    private ArrayList<Laiteosa> osat;

    public Kotelo() {
        this.osat = new ArrayList<>();
        osat.add(new Kiintolevypaikka());
        osat.add(new Kiintolevypaikka());
        osat.add(new Virtalahde());
        osat.add(new Tuuletin());
        osat.add(new Tuuletin());
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
