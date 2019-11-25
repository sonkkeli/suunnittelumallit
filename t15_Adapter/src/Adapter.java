/**
 *
 * @author sonja
 */
public class Adapter implements Player {
    MultiPlayer ps;
    
    public Adapter(String diskType){
        if(diskType.equalsIgnoreCase("blueray")) ps = new BlueRay();
        if(diskType.equalsIgnoreCase("cd")) ps = new CD();
        if(diskType.equalsIgnoreCase("dvd")) ps = new DVD();
    }

    @Override
    public void play(String diskType, String diskTitle) {
        if(diskType.equalsIgnoreCase("blueray")) ps.playBlueray(diskTitle);
        if(diskType.equalsIgnoreCase("cd")) ps.playCD(diskTitle);
        if(diskType.equalsIgnoreCase("dvd")) ps.playDVD(diskTitle);
    }
}
