/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author vidan
 */
public class Sampinjoni extends Prilozi{

    public Sampinjoni(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public double vratiCenu() {
        return super.vratiCenu()+ 150; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiOpis() {
        return super.vratiOpis()+ "Sampinjoni\n"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Sampinjoni";
    }
    
    
    
}
