/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonja
 */
public class Menu {
    private List<Pizza> menu;

    public Menu() {
        this.menu = new ArrayList<>();
    }
    
    public void addToMenu(Pizza p){
        this.menu.add(p);
    }
    
    public void tulostaMenu(){
        for (Pizza p : menu) {
            System.out.println(p.getKuvaus() + " " + p.getHinta());
        }
    }
    
}
