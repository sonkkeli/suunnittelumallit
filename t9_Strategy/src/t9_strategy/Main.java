package t9_strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonja
 */
public class Main {
    public static void main(String[] args) {
        ListConverterUser a = new ListConverterUser(new Strategy1());        
        List<String> lista = new ArrayList<>();        
        for (int i = 0 ; i <= 10; i++) lista.add("testi" + i);
        
        a.tulostaLista(lista);
        System.out.println("-----------------------------");
        a.setStrategy(new Strategy2());
        a.tulostaLista(lista);
        System.out.println("-----------------------------");
        a.setStrategy(new Strategy3());
        a.tulostaLista(lista);
    }    
}
