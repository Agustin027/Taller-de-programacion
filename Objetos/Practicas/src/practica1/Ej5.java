package practica1;
import PaqueteLectura.GeneradorAleatorio;
public class Ej5 {
        public static void main(String[] args) {
            GeneradorAleatorio.iniciar();
           int [][] calificaciones = new int [5][4];     

           for (int i=0;i<5;i++){
               for(int j=0;j<4;j++){
             //  System.out.println("Ingresar calificacion 1-10");
               calificaciones[i][j]= GeneradorAleatorio.generarInt(10)+1;
               }
           }
          
                 for (int i=0;i<5;i++){
               for(int j=0;j<4;j++)
                   System.out.println("El cliente "+(i+1)+" califico el aspecto "+j+" con: "+calificaciones[i][j]);
             System.out.println("-------------------------------------------------");
            }
        
           
           
             double cant;
            for (int j=0;j<4;j++){
                    cant = 0;
                    for (int i=0;i<5;i++)
                        cant=cant+calificaciones[i][j];
                    System.out.println("el promedio del aspecto "+j+" es "+(cant/5));
                    }
            
            
        
        }
               
    
}
