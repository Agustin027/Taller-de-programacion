
package parcialfacultad;

public class AlumnoGrado extends Alumno  {
   private String carrera;

    public AlumnoGrado(String carrera, int dni, String nombre, int N) {
        super(dni, nombre, N);
        this.carrera = carrera;
    }
    
    
}
