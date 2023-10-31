/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialtetro;

/**
 *
 * @author agust
 */
public class Butaca {
    private String descriptor;
    private double precio;
   private boolean estaOcupada;

    public Butaca(double precio, String desc) {
        this.descriptor = desc;
        this.precio = precio;
        this.estaOcupada = false;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    @Override
    public String toString() {
        return "Butaca{" + "descriptor=" + descriptor + ", precio=" + precio + ", estaOcupada=" + estaOcupada + '}';
    }
    
    
    
}
