
package parcialfacultad;


public class ParcialFacultad {

    public static void main(String[] args) {
        AlumnoDoctorado Ad= new AlumnoDoctorado("Licenciatura en informatica", "UNLP", 12345, "PEPE", 4);
        AlumnoGrado Ag= new AlumnoGrado("Apu", 66666, "Juan", 3);
        
        Ad.AgregarMateria(new Materias("Metodologias de la investigacion", 10, "10/12/2023"));
         Ad.AgregarMateria(new Materias("Taller de programacion", 7, "10/10/2023"));
         Ad.AgregarMateria(new Materias("Cadp", 5, "1/10/2023"));
          Ad.AgregarMateria(new Materias("OC", 5, "1/10/2023"));
         
         Ag.AgregarMateria(new Materias("Cadp", 5, "1/10/2023"));
         Ag.AgregarMateria(new Materias("Cadp", 5, "1/10/2023"));
         
         
         System.out.println(Ad);
           System.out.println(Ag);
    }
    
}
