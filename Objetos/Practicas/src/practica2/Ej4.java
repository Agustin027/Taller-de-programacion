package practica2;

import PaqueteLectura.GeneradorAleatorio;

public class Ej4 {
      public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
       int [] v = new int [5];
        Persona [][] tabla = new Persona[5][8];
        String nombre = GeneradorAleatorio.generarString(3);
        int dni = GeneradorAleatorio.generarInt(56000000);
         int edad = GeneradorAleatorio.generarInt(100);
          int dia = GeneradorAleatorio.generarInt(5);
         int cont =0;
        
          for (int i = 0; i < 5; i++) {
              v[i]=0;
          }
         
         while(!nombre.equals("zzz") && cont<40){
             if (v[dia]<8) {
                   tabla[dia][v[dia]] =new Persona(nombre, dni, edad);
                   v[dia]++;
                  cont++;
             }
             else
                 System.out.println("No existe turno");
                nombre  = GeneradorAleatorio.generarString(3);
                 dni = GeneradorAleatorio.generarInt(56000000);
                 edad = GeneradorAleatorio.generarInt(100);
                 dia = GeneradorAleatorio.generarInt(5);
             
         }
         
         for(int i=0;i<5;i++){
                System.out.println("En el dia "+(i+1)+" hay "+v[i]+" inscriptos ");
                    for(int j=0; j<v[i]; j++)
                        System.out.println(tabla[i][j].getNombre());
         }
             
         
              
     
    }
    
    }
