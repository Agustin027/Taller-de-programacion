
package parcialalumnos;


public class ParcialAlumnos {


    public static void main(String[] args) {
     AlumnosDoctorado AluD= new AlumnosDoctorado("APU", "UNLP", 77777, "PEPE", 5);
     AlumnosdGrado AluG= new AlumnosdGrado("Licenciatura en Infomatica", 12345, "Juan", 3);
     AluD.AgregarNota(new Materias("CADP", 10, "1/1/2020"));
     AluD.AgregarNota(new Materias("OC", 7, "13/11/2020"));
    AluD.AgregarNota(new Materias("Taller", 10, "12/1/2020"));
    
    AluG.AgregarNota(new Materias("AYED", 10, "6/1/2020"));
    AluG.AgregarNota(new Materias("EPA", 9, "17/1/2020"));
    AluG.AgregarNota(new Materias("Tesis", 7, "7/7/2020"));
               
    
        System.out.println(AluD);
        System.out.println("----------------------------------");
        System.out.println(AluG);
    
    }
    
}
