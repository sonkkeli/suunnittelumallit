package t9_strategy;

import java.util.List;

/**
 * rivinvaihto joka KOLMANNEN alkion jälkeen
 * @author sonja
 */
public class Strategy3 implements ListConverter {    
    
    @Override
    public String listToString(List<String> list) {
        StringBuilder str = new StringBuilder();        
        for (int i = 0; i< list.size(); i++){
            str.append(list.get(i));
            if(i%3 == 2) str.append("\n");
        }
        return str.toString();
    }
    
}
