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
class Charmander implements Pokemon{
    @Override
    public String getNimi() {
        return "Charmander";
    }

    @Override
    public void hit() {
        System.out.println("Blaze strike");
    }

    @Override
    public void revealWeaknesses() {
        System.out.println("Ground, Rock, Water");
    }
    
    @Override
    public void getStats() {
        System.out.println("HP 2, Attack 3, Defense 2, Special Attack 3, Special Defense 2, Speed 4");
    }
    
}
