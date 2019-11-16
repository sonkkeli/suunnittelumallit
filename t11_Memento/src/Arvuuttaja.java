
import java.util.Random;

/**
 *
 * @author sonja
 */
class Arvuuttaja {
    private Memento m;
        
    public void add(Memento state){
        this.m = state;
    }
    
    public Memento liityPeliin(Pelaaja p){        
        Originator o = new Originator();
        Random r = new Random();
        o.setState(r.nextInt(11));
        return o.saveToMemento();
    }
    
    public boolean arvaa(Pelaaja p, int luku) {
        return luku == p.getState().getState();
    }
}
