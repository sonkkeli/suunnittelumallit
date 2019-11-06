package t7_state;

/**
 *
 * @author sonja
 */
public class T7_State {
    public static void main(String[] args) {
        Controller c = new Controller();
        
        c.setCharmander();
        getDetails(c);
        System.out.println("-----------------------");
        
        c.setCharmeleon();
        getDetails(c);
        System.out.println("-----------------------");
        
        c.setCharizard();
        getDetails(c);
        
    }
    
    private static void getDetails(Controller c) {
        c.getNimi();
        c.revealWeaknesses();
        c.hit();
        c.getStats();
    }
}
