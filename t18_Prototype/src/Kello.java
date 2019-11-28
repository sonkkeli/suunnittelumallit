/**
 *
 * @author sonja
 */
public class Kello implements Cloneable{
    private Viisari tunti = new TuntiViisari(null);
    private Viisari minuutti = new MinuuttiViisari(tunti);
    private Viisari sekunti = new SekuntiViisari(minuutti);
    
    public void tick(){
        sekunti.tick();
    }
    
    public String getAika(){
        return tunti + ":" + minuutti + ":" + sekunti;
    }
    
    @Override public Kello clone() throws CloneNotSupportedException{
        Kello clone = (Kello)super.clone();
        clone.tunti = tunti.clone();
        clone.minuutti = minuutti.clone();
        clone.sekunti = sekunti.clone();
        return clone;        
    }    
}
