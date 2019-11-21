
/**
 *
 * @author sonja
 */
public class NaughtyBurger extends BurgerBuilder {
    
    private StringBuilder burger;
	
    @Override
    public StringBuilder getBurger(){
        return burger;
    }
    
    @Override
    public void createNewBurger() {
        burger = new StringBuilder();
    }
    
    @Override
    public void buildTyyppi() {
        burger.append("Naughty burger: ");
    }

    @Override
    public void buildPihvi() {
        burger.append("Suomalainen 100% rotukarjan pihvi, ");
    }

    @Override
    public void buildLeipa() {
        burger.append("Gluteeniton vegaaninen sämpylä");
    }
}
