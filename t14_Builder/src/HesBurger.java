import java.util.*;

/**
 *
 * @author sonja
 */
public class HesBurger extends BurgerBuilder {
    @Override
    public void buildTyyppi() {
        burger.setTyyppi("kerroshampurilainen");
    }

    @Override
    public void buildPihvi() {
        burger.setPihvi("kinkkupihvi");
    }

    @Override
    public void buildLeipa() {
        burger.setLeipa("leipä siemenillä");
    }    
}
