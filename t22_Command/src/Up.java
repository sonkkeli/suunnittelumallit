/**
 *
 * @author sonja
 */
public class Up implements Command{
    private Valkokangas v;
    
    public Up(Valkokangas v){
        this.v = v;
    }
    
    @Override
    public void execute() {
        v.setUp();
    }
}
