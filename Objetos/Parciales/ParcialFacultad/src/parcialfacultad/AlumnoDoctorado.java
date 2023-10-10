
package parcialfacultad;


public class AlumnoDoctorado extends Alumno{
    String titulo;
    String universidadOrigen;

    public AlumnoDoctorado(String titulo, String universidadOrigen, int dni, String nombre, int N) {
        super(dni, nombre, N);
        this.titulo = titulo;
        this.universidadOrigen = universidadOrigen;
    }
    
    
    public boolean EstaGraduado(){
     boolean ok=false;
        for (int i = 0; i < super.getN(); i++) {
            if (super.EstaGraduado() && super.getvMaterias()[i].getNombre().equalsIgnoreCase("Metodologias de la Investigacion")) {
                ok=true;
            }
        }
     
     
     return ok;
    }
}
