
package parcialfacultad;

public class Materias {
    private String nombre;
    private double nota;
    private String fecha;

    public Materias(String nombre, double nota, String fecha) {
        this.nombre = nombre;
        this.nota = nota;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Materias{" + "nombre=" + nombre + ", nota=" + nota + ", fecha=" + fecha + '}';
    }
    
    
}
