package practica2;
import PaqueteLectura.Lector;
public class Ej1 {
    public static void main(String[] args) {
  String name =Lector.leerString();
  int dni=Lector.leerInt();
  int edad=Lector.leerInt();
  Persona P = new Persona(name, dni, edad);
  
  String a=P.toString();
        System.out.println(a);
    }
}
    