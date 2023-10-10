
package psicologo;

public class Paciente {
   private String nombre;
   private boolean tieneObraSocial;
   private double costoxSesion;

    public Paciente(String nombre, boolean tieneObraSocial, double costoxSesion) {
        this.nombre = nombre;
        this.tieneObraSocial = tieneObraSocial;
        this.costoxSesion = costoxSesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneObraSocial() {
        return tieneObraSocial;
    }

    public void setTieneObraSocial(boolean tieneObraSocial) {
        this.tieneObraSocial = tieneObraSocial;
    }

    public double getCostoxSesion() {
        return costoxSesion;
    }

    public void setCostoxSesion(double costoxSesion) {
        this.costoxSesion = costoxSesion;
    }
   
   
   
   
    
}
