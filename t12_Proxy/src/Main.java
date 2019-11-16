
import java.util.*;


/**
 *
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Image> t = new ArrayList<>();
        Image i1 = new ProxyImage("test1");
        Image i2 = new ProxyImage("test2");
        Image i3 = new ProxyImage("test3");
        Image i4 = new ProxyImage("test4");
        
        t.add(i1);
        t.add(i2);
        t.add(i3);
        t.add(i4);
        
        System.out.println("*** showData() ***");
        for (Image i : t) i.showData();
        
        System.out.println("\n*** displayImage() ***");
        
        for (Image i : t) i.displayImage();
    }
    
}
