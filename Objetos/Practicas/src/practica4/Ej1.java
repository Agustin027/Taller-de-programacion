package practica4;

public class Ej1 {
    
    public static void main(String[] args) {
        Triangulo T=new Triangulo("rojo" ,"verde", 5, 5, 6);
        System.out.println(T);
        
        Circulo C = new Circulo(10, "azul", "negro");
        System.out.println(C);
        C.despintar();
        System.out.println(C);
        T.despintar();
        System.out.println(T);

    }
    
}
