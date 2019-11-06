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
public class Controller {
    private Pokemon pokemon;
    public Charmander c1;
    public Charmeleon c2;
    public Charizard c3;

    public Controller() {
        c1 = new Charmander();
        c2 = new Charmeleon();
        c3 = new Charizard();
    }

    public void setCharmander() {
        pokemon = c1;
    }

    public void setCharmeleon() {
        pokemon = c2;
    }

    public void setCharizard() {
        pokemon = c3;
    }
    
    public void getNimi(){
        System.out.println(pokemon.getNimi());
    }
    
    public void hit(){
        System.out.print("Hit: ");
        pokemon.hit();
    }
    
    public void revealWeaknesses(){
        System.out.print("Weaknesses: ");
        pokemon.revealWeaknesses();
    }
    
    public void getStats(){
        System.out.print("Stats: ");
        pokemon.getStats();
    }
    
}
