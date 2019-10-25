/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author sonja
 */
public class Kengat implements Vaate {
    private String merkki;

    public Kengat(String merkki) {
        this.merkki = merkki;
    }
    
    @Override
    public String toString() {
        return "kengat, joiden merkki on " + merkki;
    }   
}
