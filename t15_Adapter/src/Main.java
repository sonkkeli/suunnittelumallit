/**
 *
 * @author sonja
 */
public class Main {

    /**
     * in this example, playstation 4 is the adapter, 
     * which can play multiple disk types
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayStation4 p = new PlayStation4();
        p.play("dvd", "turha leffa");
        p.play("cd", "kirsi ranto");
        p.play("blueray", "hieno sininen disketti");
    }
    
}
