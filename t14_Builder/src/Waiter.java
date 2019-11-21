
/**
 * director class
 * @author sonja
 */
public class Waiter {
    private BurgerBuilder builder;

    public void setBurgerBuilder(BurgerBuilder b) {
        builder = b;
    }

    public Burger getBurger() {
        return builder.getBurger();
    }

    public void constructBurger() {
        builder.createNewBurger();
        builder.buildLeipa();
        builder.buildPihvi();
        builder.buildTyyppi();
    }
}
