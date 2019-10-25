package observer;

/**
 *
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock d = new DigitalClock(timer);
        int i = 0;
        while (i < 10000){
            timer.tick();
            i++;
        }        
    }    
}
