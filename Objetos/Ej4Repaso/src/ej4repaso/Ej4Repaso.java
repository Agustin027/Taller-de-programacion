
package ej4repaso;

import PaqueteLectura.Lector;
public class Ej4Repaso {

  
    public static void main(String[] args) {
       System.out.println("Ingrese cantidad de coristas para coro semi circular");   
        CoroSemicircular coroSemiC=new CoroSemicircular(Lector.leerInt(), "Coro semiC", new Director("PEPE", 123456, 7) );
        
        System.out.println("Ingrese cantidad de hileras");   
        CoroHileras coroHileras = new CoroHileras(Lector.leerInt(), "Coro Hileras", new Director("vegetta", 777777, 7));
        
       
        //-------------------------------------------------------------------------------
       coroSemiC.agregarCorista(new Corista("Corista 1", 1, 21, 1));
         coroSemiC.agregarCorista(new Corista("Corista 1", 1, 21, 1));
         coroSemiC.agregarCorista(new Corista("Corista 1", 1, 21, 1));
         coroSemiC.agregarCorista(new Corista("Corista 1", 1, 21, 1));
         coroSemiC.agregarCorista(new Corista("Corista 1", 1, 21, 1));
        
       
        //-------------------------------------------------------------------------------
            coroHileras.agregarCorista(new Corista("Corista 1", 1, 21, 1));
            coroHileras.agregarCorista(new Corista("Corista 1", 1, 21, 1));
            coroHileras.agregarCorista(new Corista("Corista 1", 1, 21, 1));
            coroHileras.agregarCorista(new Corista("Corista 1", 1, 21, 1));
            coroHileras.agregarCorista(new Corista("Corista 1", 1, 21, 1));
            coroHileras.agregarCorista(new Corista("Corista 1", 1, 21, 1));
             coroHileras.agregarCorista(new Corista("Corista 1", 1, 21, 1));
          
        //-------------------------------------------------------------------------------
        
        
        
       
        System.out.println( coroSemiC.toString());
        System.out.println("================================");
        System.out.println(coroHileras.toString());
    }
    
}
