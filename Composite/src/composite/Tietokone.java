package composite;

import java.util.ArrayList;

/**
 *
 * @author sonja
 */
public class Tietokone {
    private ArrayList<Laiteosa> osat;

    public Tietokone() {
        this.osat = new ArrayList<>();
    }
    
    public void alustaKokoonpano() {
        this.osat.add(new Emolevy());
        this.osat.add(new Naytonohjain());
        this.osat.add(new Kotelo());
        this.osat.add(new Muistipiiri());
        this.osat.add(new Prosessori());
        this.osat.add(new Verkkokortti());
    }
    
    public void laskeHinta() {
        int summa = 0;
        for (Laiteosa l : osat){
            summa += l.getHinta();
        }
        System.out.println(summa);
    }
    
}
