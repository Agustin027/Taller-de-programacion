package practica3;
import  PaqueteLectura.Lector;
public class Ej3 {
    public static void main(String[] args) {
        Estante E= new Estante();
        
        System.out.println(E.Cantlibros());
        System.out.println("ingresar cantidad de libros a ingresar");
        int diml=Lector.leerInt();
         Libro l;
        for (int i = 0; i < diml; i++) {
            System.out.println("ingresar titulo de libro");
            String titulo=Lector.leerString();
             System.out.println("ingresar nombre del autor");
            String autor=Lector.leerString();
            l=new Libro(titulo,autor);
            E.agregarLibro(l);
        }
       System.out.println(E.Cantlibros());
        System.out.println(E.DevolverLibro("Mujercitas").getPrimerAutor().getNombre());
       
    }
 
}
