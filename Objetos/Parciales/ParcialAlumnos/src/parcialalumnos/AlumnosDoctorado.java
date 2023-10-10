
package parcialalumnos;

public class AlumnosDoctorado extends Alumnos{
    String tituloUniversitario;
    String universidadOrigen;

    public AlumnosDoctorado(String tituloUniversitario, String universidadOrigen, int dni, String nombre, int N) {
        super(dni, nombre, N);
        this.tituloUniversitario = tituloUniversitario;
        this.universidadOrigen = universidadOrigen;
    }

    @Override
    public String toString() {
        return super.toString()+"   AlumnosDoctorado{" + "tituloUniversitario=" + tituloUniversitario + ", universidadOrigen=" + universidadOrigen + '}';
    }


    
    
    
    
    
}
