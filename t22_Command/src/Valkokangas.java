/**
 *
 * @author sonja
 */
class Valkokangas{
    private boolean up = false;
    
    public void setUp(){
        this.up = true;
        System.out.println(this);
    }
    
    public void setDown(){
        this.up = false;
        System.out.println(this);
    }
    
    @Override 
    public String toString(){
        return "Valkokangas: " + (up ? "up" : "down");
    }
}
