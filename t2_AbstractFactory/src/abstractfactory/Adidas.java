package abstractfactory;

/**
 *
 * @author sonja
 */
public class Adidas implements Merkki {
    private String merkki;
    private Kengat kengat;
    private Lippis lippis;
    private Tpaita paita;
    private Farmarit farmarit;

    public Adidas() {
        this.merkki = "adidas";
    }
    
    @Override
    public void pueVaatteet(){
        this.kengat = new Kengat(merkki);
        this.lippis = new Lippis(merkki);
        this.paita = new Tpaita(merkki);
        this.farmarit = new Farmarit(merkki);
    }
    
    @Override
    public void luetteleVaatekappaleet(){
        System.out.println(this.kengat);
        System.out.println(this.lippis);
        System.out.println(this.paita);
        System.out.println(this.farmarit);
    }
}