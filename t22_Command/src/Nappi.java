
/**
 *
 * @author sonja
 */
public class Nappi {
    Command command;
    
    public Nappi(Command command){
        this.command = command;
    }
    
    public void paina(){
        command.execute();
    }
}
