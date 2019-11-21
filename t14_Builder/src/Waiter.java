
/**
 * director class
 * @author sonja
 */
public class Waiter {
    private BurgerBuilder builder;

    public void setBurgerBuilder(BurgerBuilder b) {
        builder = b;
    }

    public Object getBurger() {
        return builder.getBurger();
    }

    public void constructBurger() {
        builder.createNewBurger();
        builder.buildTyyppi();        
        builder.buildPihvi();
        builder.buildLeipa();
    }
}
