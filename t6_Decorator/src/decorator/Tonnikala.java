/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author sonja
 */
public class Tonnikala extends Tayte {
    
    public Tonnikala(Pizza p) {
        super(p);
    }
    @Override
    public int getHinta() {
        return p.getHinta() + 2;
    }
    
    @Override
    public String getKuvaus() {
        return p.getKuvaus()+ ", tonnikala";
    }
}
