
package practica3;

public class Autor {
    private String nombre;
    private String biografia;
    private String origen;

    public Autor(String nombre, String biografia, String origen) {
        this.nombre = nombre;
        this.biografia = biografia;
        this.origen = origen;
    }
    
    public Autor(String nombre){
        this.nombre = nombre;
        this.biografia = "' ";
        this.origen = "' ";
    }

     public Autor(){
        this.nombre = "sin autor";
        this.biografia = "' ";
        this.origen = "' ";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Autor: (" + "Nombre=" + nombre + ", Biografia=" + biografia + ", Origen=" + origen + " )";
    }
    
    
 
}
 