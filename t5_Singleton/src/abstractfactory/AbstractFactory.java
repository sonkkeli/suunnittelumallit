
package abstractfactory;

/**
 *
 * @author sonja
 */
public class AbstractFactory {
    private static AbstractFactory INSTANCE = null;
    private AbstractFactory(){
        Henkilo hlo = new Henkilo("jasper");
        hlo.pueVaatteet();
        hlo.luetteleVaatekappaleet();
    };
    
    public static AbstractFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new AbstractFactory();
        }
        return INSTANCE;
    }
}
