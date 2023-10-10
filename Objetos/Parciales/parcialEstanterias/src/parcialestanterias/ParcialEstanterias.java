
package parcialestanterias;

public class ParcialEstanterias {

    public static void main(String[] args) {
       Estanterias E= new  Estanterias(5, 3);
       
       
       E.almacenarLibro(new Libro("Libro 1", "Autor 1", 500), 0, 0);
       E.almacenarLibro(new Libro("Libro 2", "Autor 2", 520), 0, 1);
       E.almacenarLibro(new Libro("Libro 3", "Autor 3", 540), 0, 2);
       E.almacenarLibro(new Libro("Libro 4", "Autor 4", 500), 1, 0);
       E.almacenarLibro(new Libro("Libro 5", "Autor 5", 300), 1, 1);
       E.almacenarLibro(new Libro("Libro 6", "Autor 6", 530), 1, 2);
       E.almacenarLibro(new Libro("Libro 7", "Autor 7", 700), 2, 0);
       E.almacenarLibro(new Libro("Libro 8", "Autor 8", 600), 2, 1);
        E.almacenarLibro(new Libro("Libro 9", "Autor 9", 200), 3, 2);
        
        System.out.println(E.sacarLibro("pepe"));
        
        System.out.println(E.calcular().getTitulo());
        
        
    }
    
}
