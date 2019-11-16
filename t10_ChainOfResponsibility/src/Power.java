/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonja
 */
abstract class Power {
    protected static final double BASE = 4000;    
    protected Power successor;
    
    public void setSuccessor(Power successor) {
        this.successor = successor;
    }
    
    abstract public void processRequest(double request);
}
