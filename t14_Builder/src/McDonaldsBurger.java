
/**
 *
 * @author sonja
 */
public class McDonaldsBurger extends BurgerBuilder {
    @Override
    public void buildTyyppi() {
        burger.setTyyppi("euron juusto");
    }

    @Override
    public void buildPihvi() {
        burger.setPihvi("naudanlihapihvi");
    }

    @Override
    public void buildLeipa() {
        burger.setLeipa("pullaleipä");
    }
}
