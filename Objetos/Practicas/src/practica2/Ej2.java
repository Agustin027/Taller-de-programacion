package practica2;
import PaqueteLectura.GeneradorAleatorio;
public class Ej2 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF=15;  
        Persona [] v = new Persona[DF];
        
        String nombre = GeneradorAleatorio.generarString(10);
        int dni  = GeneradorAleatorio.generarInt(50000000);
        int edad =GeneradorAleatorio.generarInt(100);
        int i =0 ;
        int m65 = 0;
        int min = 70000000;
        int  indice = 0;
        while( i<15 && edad!=0){
            if (edad > 65)
                m65++;
            if (dni <min){
                min=dni;
                indice=i;
            }
               
            v[i]=new Persona(nombre, dni, edad);
             nombre = GeneradorAleatorio.generarString(10);
             dni  = GeneradorAleatorio.generarInt(9);
             edad =GeneradorAleatorio.generarInt(10);
             i++;
        }
        
        System.out.println("la cantidad de personas mayores a 65 son: "+m65);
        System.out.println("la persona con menor dni es: "+v[indice].toString());
        
        for (int j = 0; j < i; j++) {
            System.out.println(v[j].toString());
            
        }
    }
    
}