package t9_strategy;

import java.util.List;

/**
 *
 * @author sonja
 */
public class ListConverterUser {
    private ListConverter strategy;
    
    public ListConverterUser(ListConverter strategy){
        this.strategy = strategy;
    }
    
    public void setStrategy(ListConverter strategy){
        this.strategy = strategy;
    }
    
    public void tulostaLista(List<String> list) {
        System.out.println(strategy.listToString(list));
    }
}
