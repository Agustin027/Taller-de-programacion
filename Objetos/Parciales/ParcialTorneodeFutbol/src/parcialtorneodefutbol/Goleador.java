
package parcialtorneodefutbol;


public class Goleador {
    private String nombre;
    private String nombreEquipo;
    private int cantGoles;

    public Goleador(String nombre, String nombreEquipo, int cantGoles) {
        this.nombre = nombre;
        this.nombreEquipo = nombreEquipo;
        this.cantGoles = cantGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }

    @Override
    public String toString() {
        return "Goleador{" + "nombre=" + nombre + ", nombreEquipo=" + nombreEquipo + ", cantGoles=" + cantGoles + '}';
    }
    
    
    
}
