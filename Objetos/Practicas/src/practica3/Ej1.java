package practica3;
import PaqueteLectura.Lector;
public class Ej1 {
    
    public static void main(String[] args) {
          System.out.println("ingresar lado ");
   double lado1=Lector.leerDouble();
     System.out.println("ingresar lado ");
   double lado2=Lector.leerDouble();
     System.out.println("ingresar lado ");
   double lado3=Lector.leerDouble();
        System.out.println("Ingresar color de relleno");
            String relleno =Lector.leerString();
                System.out.println("Ingresar color de linea");
            String linea =Lector.leerString();

        Triangulo T = new Triangulo(lado1,lado2,lado3,relleno,linea);
        System.out.println("el perimetro del triangulo es "+T.toPerimetro());
        System.out.println("el area del triangulo es "+T.toArea());
    }
    
}
