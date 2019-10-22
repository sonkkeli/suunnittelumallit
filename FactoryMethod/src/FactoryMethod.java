/**
 *
 * @author sonja
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        System.out.println("");
        AterioivaOtus oppilas = new Oppilas();
        oppilas.aterioi();
        System.out.println("");
        AterioivaOtus siivooja = new Siivooja();
        siivooja.aterioi();
        System.out.println("");
        AterioivaOtus teekkari = new Teekkari();
        teekkari.aterioi();
    }
    
}
