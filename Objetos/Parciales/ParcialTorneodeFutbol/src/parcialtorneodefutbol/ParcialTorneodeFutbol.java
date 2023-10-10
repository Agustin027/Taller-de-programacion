
package parcialtorneodefutbol;

public class ParcialTorneodeFutbol {

    public static void main(String[] args) {
        
        Torneo T = new Torneo("Torneo de pepe", 5, 10);
        
        T.agregarGoleador(0, new Goleador("Pepe1", "Estudiantes", 70));
        T.agregarGoleador(0, new Goleador("Pepe2", "Estudiantes", 7));
        T.agregarGoleador(0, new Goleador("Pepe3", "Estudiantes", 0));
        T.agregarGoleador(0, new Goleador("Pepe4", "Estudiantes", 20));
        T.agregarGoleador(0, new Goleador("Pepe5", "Estudiantes", 10));
        T.agregarGoleador(3, new Goleador("Juan", "Boca", 30));
        
        System.out.println(T.GoleadorMenosGoles(0)); 
        System.out.println(T.CantGoleadores());
        System.out.println(T);
        
    }
    
}
