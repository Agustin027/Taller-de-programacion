
package practica3;

public class Ej2 {

    public static void main(String[] args) {
        Autor a = new Autor("George R. R. Martin", "Bio", "EEUU");
       
        Libro libro1= new  Libro( "A Game of Thrones (A Song of Ice and Fire, #1)",
                                                     "Bantam", 1996, a, "9780553588484", 21.72);
        
         a = new Autor("Brandon Sanderson", "Bio", "EEUU");
        Libro libro2= new Libro("Mistborn:The Final Empire", "Tor Books", a, "9780765311788");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro 2: " +libro2.getPrecio());
        System.out.println("Año edición del libro 2: " +libro2.getAñoEdicion());
        Libro libro3= new Libro(); 
        System.out.println(libro3);
    }
    
}
