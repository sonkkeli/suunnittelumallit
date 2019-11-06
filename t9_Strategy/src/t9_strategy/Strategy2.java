package t9_strategy;

import java.util.List;

/**
 * rivinvaihto joka TOISEN alkion jälkeen
 * @author sonja
 */
public class Strategy2 implements ListConverter {
    private boolean toggler = false;
    
    @Override
    public String listToString(List<String> list) {
        StringBuilder str = new StringBuilder();
        for (String a : list){
            str.append(a);
            if(toggler) str.append("\n");
            toggler = !toggler;
        }        
        return str.toString();
    }    
}