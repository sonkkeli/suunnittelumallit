/**
 *
 * @author sonja
 */
abstract class BurgerBuilder {
    protected Burger burger;

    public Burger getBurger() {
        return burger;
    }

    public void createNewBurger() {
        burger = new Burger();
    }

    public abstract void buildTyyppi();
    public abstract void buildPihvi();
    public abstract void buildLeipa();
}
