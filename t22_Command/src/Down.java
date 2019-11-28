/**
 *
 * @author sonja
 */
public class Down implements Command {
    private Valkokangas v;
    
    public Down(Valkokangas v){
        this.v = v;
    }
    
    @Override
    public void execute(){
        v.setDown();
    }
}
