package practica3;
import PaqueteLectura.Lector;
public class Ej5 {
    public static void main(String[] args) {
        System.out.println("ingresar radio");
        double radio = Lector.leerDouble();
        System.out.println("ingresar color de relleno");
        String relleno = Lector.leerString();
        System.out.println("ingresar color de la linea");
        String colorL = Lector.leerString();
        Circulos c = new Circulos(radio, relleno, colorL);
        
        System.out.println("Perimetro "+c.calcularP());
        System.out.println("Area "+c.calcularA());
    }
    
}
