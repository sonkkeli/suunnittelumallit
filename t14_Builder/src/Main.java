/**
 *
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        BurgerBuilder hese = new HesBurger();
        BurgerBuilder naughty = new NaughtyBurger();

        waiter.setBurgerBuilder( hese );
        waiter.constructBurger();

        Burger b = waiter.getBurger();
        System.out.println(b);
    }    
}
