/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4repaso;

public abstract  class Coro {
    private String nombre;
    private Director d;

    public Coro(String nombre, Director d) {
        this.nombre = nombre;
        this.d = d;
    }

    
    public abstract void agregarCorista(Corista C);
    public abstract boolean estalleno();
    public abstract boolean estaBienFormado();

    @Override
    public String toString() {
        return "Nombre del coro " + nombre +"\n" +"Director [" + d + "] ";
    }
    
    
}
