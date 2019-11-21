
import java.util.ArrayList;

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
        waiter.setBurgerBuilder(hese);
        waiter.constructBurger();
        Object b1 = waiter.getBurger();
        printBurger(b1);
        
        BurgerBuilder naughty = new NaughtyBurger();
        waiter.setBurgerBuilder(naughty);
        waiter.constructBurger();
        Object b2 = waiter.getBurger();
        printBurger(b2);
    }
    
    @SuppressWarnings("unchecked")
    private static void printBurger(Object burger) {
        if (burger instanceof ArrayList){
            ((ArrayList<String>) burger).forEach(i -> System.out.print(i+", "));
            System.out.println("");
        } else {
            System.out.println(burger);
        }        
    }
}
