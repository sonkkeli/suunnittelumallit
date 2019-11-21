import java.util.*;

/**
 *
 * @author sonja
 */
public class HesBurger extends BurgerBuilder {    
    private List<String> burger;
	
    @Override
    public List getBurger(){
        return burger;
    }
    
    @Override
    public void createNewBurger() {
        this.burger = new ArrayList();
        this.burger.add("Hesburger");
    }
        
    @Override
    public void buildTyyppi() {
        burger.add("kerroshampurilainen");
    }

    @Override
    public void buildPihvi() {
        burger.add("kinkkupihvi");
    }

    @Override
    public void buildLeipa() {
        burger.add("leipä siemenillä");
    }    
}
