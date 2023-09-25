package practica2;
//consultar
import PaqueteLectura.GeneradorAleatorio;
public class Ej3 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Persona [][] tabla = new Persona[5][8];
        String nombre = GeneradorAleatorio.generarString(3);
        int dni = GeneradorAleatorio.generarInt(56000000);
         int edad = GeneradorAleatorio.generarInt(100);
         int dias =0;
          int turno=0;
         while(!nombre.equals("'zzz")&& dias<5 ){
            turno =0;
             while(!nombre.equals("'zzz")&& turno<8){
                 tabla[dias][turno]=new Persona(nombre, dni, edad);
                 nombre = GeneradorAleatorio.generarString(3);
                 dni = GeneradorAleatorio.generarInt(56000000);
                 edad = GeneradorAleatorio.generarInt(100);
                 turno++;
             }
             dias++;
         }
         
         for(int i=0;i<dias;i++)
             for(int j=0; j<turno; j++)
                 System.out.println("dia: "+(i+1)+" turno "+(j+1)+":"+tabla[i][j].getNombre());
    }
}
