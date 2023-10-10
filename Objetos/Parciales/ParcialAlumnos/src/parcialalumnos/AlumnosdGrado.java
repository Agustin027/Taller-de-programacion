
package parcialalumnos;

public class AlumnosdGrado extends Alumnos{
    String carrera;

    public AlumnosdGrado(String carrera, int dni, String nombre, int N) {
        super(dni, nombre, N);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + " carrera= " + carrera;
    }
    
    
    
}
