package ej4repaso;


public class Corista {
    private String nombreC;
    private int dni;
    private int edad;
    private int tonoF;

    public Corista(String nombreC, int dni, int edad, int tonoF) {
        this.nombreC = nombreC;
        this.dni = dni;
        this.edad = edad;
        this.tonoF = tonoF;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTonoF() {
        return tonoF;
    }

    public void setTonoF(int tonoF) {
        this.tonoF = tonoF;
    }

    @Override
    public String toString() {
        return "{" + "nombreC=" + nombreC + ", dni=" + dni + ", edad=" + edad + ", tonoF=" + tonoF + '}';
    }
    
    
    
    
}
