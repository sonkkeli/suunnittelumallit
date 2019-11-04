/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.List;

/**
 * pitsapohja
 * @author sonja
 */
public class PizzaPohja implements Pizza {    
    @Override
    public int getHinta() {
        return 4;
    }
    
    @Override
    public String getKuvaus() {
        return "Pizzassa on pohja";
    }
}
