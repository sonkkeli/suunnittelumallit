package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author sonja
 */
public class DigitalClock implements Observer {
    private ClockTimer timer;
    
    public DigitalClock(ClockTimer c){
        this.timer = c;
        this.timer.addObserver(this);
    }
    
    private void draw(){
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int secs = timer.getSecond();
        System.out.println(hour + ":" + minute + ":" + secs );
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == timer){
            draw();
        }
    }
}
