
package practica4;
public class VisorFigurasModificado {
 private int guardadas;
 private final int capacidadMaxima=5;
 private Figura [] vector;

 public VisorFigurasModificado(){
  Figura [] v = new Figura[capacidadMaxima];
  this.vector= v;
  guardadas=0;
 }

 public void guardar(Figura f){
  if(quedaEspacio()){
    vector[guardadas]=f;
    guardadas++;
  }
   else
         System.out.println("no hay espacio");
 }
 


public boolean quedaEspacio(){
    return(guardadas < capacidadMaxima);
 }

 public void mostrar(){
     for (int i = 0; i < guardadas; i++)
         System.out.println(vector[i]);
 }
 public int getGuardadas() {
 return guardadas;
 }

}
