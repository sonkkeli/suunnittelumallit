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
class Charmeleon implements Pokemon{

    @Override
    public String getNimi() {
        return "Charmeleon";
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
        System.out.println("HP 3, Attack 3, Defense 3, Special Attack 4, Special Defense 3, Speed 4");
    }
}
