/**
 *
 * @author sonja
 */
public class CD implements MultiPlayer {
    @Override
    public void playCD(String diskTitle) {
        System.out.println("Ny pyörii CD nimeltä "+ diskTitle);
    }

    @Override
    public void playBlueray(String diskTitle) {
        
    }

    @Override
    public void playDVD(String diskTitle) {
        
    }
    
}
