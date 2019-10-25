package observer;

import java.util.Observable;

/**
 *
 * @author sonja
 */
public class ClockTimer extends Observable {
    private int hour;
    private int minute;
    private int second;
    
    public void tick(){
        if( this.second == 59 ){            
            if (this.minute == 59){
                if (this.hour == 23){
                    this.hour = 0;
                } else {
                    this.hour++;
                }
                this.minute = 0;
            } else {
                this.minute++;
            }            
            this.second = 0;
        } else {
            this.second++;
        }
        
        setChanged();
        notifyObservers();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
