/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1repaso;
public class Subsidio {
    private double monto;
    private  String motivo;
    private boolean fueOtorgado;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Boolean getFueOtorgado() {
        return fueOtorgado;
    }

    public void setFueOtorgado(Boolean fueOtorgado) {
        this.fueOtorgado = fueOtorgado;
    }

    
    
    
    
    public Subsidio(double monto, String motivo) {
        this.monto = monto;
        this.motivo = motivo;
        this.fueOtorgado = false;
    }
    
    
    
    
    
}
