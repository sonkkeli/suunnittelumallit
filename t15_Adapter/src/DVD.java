/**
 *
 * @author sonja
 */
public class DVD implements MultiPlayer{
    @Override
    public void playCD(String diskTitle) {
        
    }

    @Override
    public void playBlueray(String diskTitle) {
        
    }

    @Override
    public void playDVD(String diskTitle) {
        System.out.println("Ny pyörii DVD nimeltä "+ diskTitle);
    }
}
