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
public class Kinkku extends Tayte {
    
    public Kinkku(Pizza p) {
        super(p);
    }
    
    @Override
    public int getHinta() {
        return p.getHinta() + 1;
    }
    
    @Override
    public String getKuvaus() {
        return p.getKuvaus()+ ", kinkku";
    }
}
