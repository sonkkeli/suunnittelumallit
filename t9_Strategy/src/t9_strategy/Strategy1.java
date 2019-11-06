package t9_strategy;

import java.util.Iterator;
import java.util.List;

/**
 * rivinvaihto joka alkion jälkeen, iteratorilla
 * @author sonja
 */
public class Strategy1 implements ListConverter {    
    
    @Override
    public String listToString(List<String> list) {
        StringBuilder str = new StringBuilder();   
        Iterator iterator = list.iterator(); 
        while (iterator.hasNext()){
            str.append(iterator.next()).append("\n");
        }        
        return str.toString();
    }    
}
