package abstractfactory;

/**
 *
 * @author sonja
 */
public class Henkilo extends Adidas {
    private String nimi;

    public Henkilo(String nimi) {
        super();
        this.nimi = nimi;        
    }
    
    @Override
    public void pueVaatteet() {
        super.pueVaatteet();
    }
    
    @Override
    public void luetteleVaatekappaleet() {
        System.out.println("Olen " + this.nimi + " ja tänään minulla on päällä: ");
        super.luetteleVaatekappaleet();
    }

    @Override
    public String toString() {
        return "nimi=" + nimi + ' ' + super.toString();
    }
}
