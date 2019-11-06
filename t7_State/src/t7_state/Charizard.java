/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7_state;

/**
 *
 * @author sonja
 */
class Charizard implements Pokemon{
    @Override
    public String getNimi() {
        return "Charizard";
    }

    @Override
    public void hit() {
        System.out.println("Blaze strike");
    }

    @Override
    public void revealWeaknesses() {        
        System.out.println("Rock, Electric, Water");
    }
    
    @Override
    public void getStats() {
        System.out.println("HP 3, Attack 4, Defense 3, Special Attack 5, Special Defense 4, Speed 5");
    }
}
