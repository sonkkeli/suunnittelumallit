
package abstractfactory;

/**
 *
 * @author sonja
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Henkilo jasper = new Henkilo("jasper");
        jasper.pueVaatteet();
        jasper.luetteleVaatekappaleet();
//        System.out.println(jasper);
    }
}
