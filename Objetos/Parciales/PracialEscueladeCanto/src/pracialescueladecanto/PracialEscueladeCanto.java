
package pracialescueladecanto;

import PaqueteLectura.Lector;
public class PracialEscueladeCanto {

   
    public static void main(String[] args) {
       Concurso C =new Concurso(3, 5);
       C.AgregarCancion(new canciones("'cancion1", "'pepe1", 1), 0);
       C.AgregarCancion(new canciones("'cancion2", "'pepe2", 2), 0);
       C.AgregarCancion(new canciones("'cancion3", "'pepe3", 3), 0);
       C.AgregarCancion(new canciones("'cancion4", "'pepe4", 4), 1);
       C.AgregarCancion(new canciones("'cancion5", "'pepe5", 5), 1);
        C.AgregarCancion(new canciones("'cancion5", "'pepe5", 5), 2);
        
        System.out.println("Ingresar nombre,apellido y Dni del estudiante");
        Estudiante E= new Estudiante(Lector.leerString(), Lector.leerString(), Lector.leerInt());
        
        System.out.println("ingresar identificador");
        int identificador=Lector.leerInt();
       System.out.println("ingresar puntaje");
        double puntaje=Lector.leerDouble();
        
        while (identificador!=0){
            C.InterpretarunaCancion(identificador, E, puntaje);
            
            System.out.println("Ingresar nombre,apellido y Dni del estudiante");
            E= new Estudiante(Lector.leerString(), Lector.leerString(), Lector.leerInt());
            
            System.out.println("ingresar identificador");
            identificador=Lector.leerInt();
            System.out.println("ingresar puntaje");
            puntaje=Lector.leerDouble();
 
        }
        
          System.out.println("ingresar identificador ganador");
           identificador = Lector.leerInt();
           if (C.ConocerEstudiante(identificador)==null)
               System.out.println("nadie");
           else
               System.out.println(C.ConocerEstudiante(identificador));
           
           canciones Cancion;
           for (int i = 0; i < 3; i++) {
              System.out.println(C.CancionConMasPuntaje(i));
        }
    }
    
    
    
 
}
