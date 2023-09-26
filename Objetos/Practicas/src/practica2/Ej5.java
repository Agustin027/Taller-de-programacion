//lo hago con aleatorios por que me dio paja leer
package practica2;
import PaqueteLectura.GeneradorAleatorio;
public class Ej5 {
    public static void main(String[] args) {
       GeneradorAleatorio.iniciar();
       int dimf =20;
       Partido [] v = new Partido [dimf];
       int cont = 0;
       String nameL ="Boca";
       String    nameV= "Riber";
       int golL=GeneradorAleatorio.generarInt(10);
       int golV = GeneradorAleatorio.generarInt(10);
       int random = GeneradorAleatorio.generarInt(2);
       if (random==0)
         nameL ="Boca";
       else
         nameV= "Riber";
       
       int riverGana=0;
       int golesBoca=0;
       while(cont<dimf && (!nameV.equals("zzz"))){
           if (nameL.equals("Boca"))
              golesBoca+=golL;
           
           v[cont]= new Partido(nameL, nameV, golL, golV);
           random = GeneradorAleatorio.generarInt(2);
            if (random==0){
              nameL ="Boca";
              nameV= "Riber";
            }
            else{
                nameV ="Boca";
                nameL= "Riber";
            }
            
           golL=GeneradorAleatorio.generarInt(10);
           golV = GeneradorAleatorio.generarInt(10);
           
          if ( v[cont].getGanador().equals("Riber"))
              riverGana++;
          cont++;
       }
           
        for (int i = 0; i < cont; i++) {
            System.out.println(v[i].getLocal()+" "+v[i].getGolesLocal()+" vs "+v[i].getGolesVisitante()+" "+v[i].getVisitante());
            
        }
           System.out.println("River gano "+riverGana+" partidos");
           System.out.println("Boca hizo "+golesBoca+" de local");
           
    }
    
}
