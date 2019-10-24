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
public class Farmarit implements Vaate{
    private String merkki;

    public Farmarit(String merkki) {
        this.merkki = merkki;
    }
    
    @Override
    public String toString() {
        return "farmarit, joiden merkki on " + merkki;
    }
}
