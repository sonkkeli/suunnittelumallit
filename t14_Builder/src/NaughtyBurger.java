
/**
 *
 * @author sonja
 */
public class NaughtyBurger extends BurgerBuilder {
    @Override
    public void buildTyyppi() {
        burger.setTyyppi("Naughty burger");
    }

    @Override
    public void buildPihvi() {
        burger.setPihvi("Suomalainen 100% rotukarjan pihvi");
    }

    @Override
    public void buildLeipa() {
        burger.setLeipa("Gluteeniton vegaaninen sämpylä");
    }
}
