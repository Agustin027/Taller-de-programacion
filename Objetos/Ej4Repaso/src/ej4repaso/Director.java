/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4repaso;

/**
 *
 * @author agust
 */
public class Director {
    private String nombreD;
    private int dni;
    private int antiguedad;

    public Director(String nombreD, int dni, int antiguedad) {
        this.nombreD = nombreD;
        this.dni = dni;
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Director{" + "nombreD=" + nombreD + ", dni=" + dni + ", antiguedad=" + antiguedad + '}';
    }
    
    
    
    
}
