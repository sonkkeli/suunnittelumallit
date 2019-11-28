/**
 *
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Valkokangas v = new Valkokangas();        
        Nappi btnUp = new Nappi(new Up(v));
        Nappi btnDown = new Nappi(new Down(v));
        
        btnUp.paina();
        btnDown.paina();
        btnDown.paina();
        btnUp.paina();
    }    
}
