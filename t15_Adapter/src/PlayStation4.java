/**
 *
 * @author sonja
 */
public class PlayStation4 implements Player {
   Adapter adapter; 

   @Override
   public void play(String diskType, String diskTitle) {
       // supportti normi pelejä varte
        if(diskType.equalsIgnoreCase("pelilevy")){
           System.out.println("Peli pyörii " + diskTitle);
           
        } else if(diskType.equalsIgnoreCase("cd") || 
                diskType.equalsIgnoreCase("dvd") || 
                diskType.equalsIgnoreCase("blueray")){
            
           adapter = new Adapter(diskType);
           adapter.play(diskType, diskTitle);
        }

        else{
           System.out.println("Levyä " + diskType + " ei voida toistaa");
        }
    }    
}
