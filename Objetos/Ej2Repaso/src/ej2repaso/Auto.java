/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2repaso;
public class Auto {
    private String nombreD;
    private String Patente;

    public Auto(String nombreD, String Patente) {
        this.nombreD = nombreD;
        this.Patente = Patente;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombreD=" + nombreD + ", Patente=" + Patente + '}';
    }
    
    
    
    
}
