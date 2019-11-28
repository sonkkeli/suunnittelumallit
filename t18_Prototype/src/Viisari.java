/**
 *
 * @author sonja
 */
abstract class Viisari implements Cloneable{
    protected int aika = 0;
    private int yla;
    private Viisari v;
    
    public Viisari(int yla, Viisari v){
        this.v = v;
        this.yla = yla;
    }
    
    public void tick(){
        this.aika++;
        if(this.aika >= this.yla){
            if(this.v != null) this.v.tick();
            this.aika = 0;
        }
    }
    
    @Override
    final public String toString(){
        return String.valueOf(this.aika);
    }
    
    @Override public Viisari clone() throws CloneNotSupportedException{
        return (Viisari) super.clone();
    }
}
