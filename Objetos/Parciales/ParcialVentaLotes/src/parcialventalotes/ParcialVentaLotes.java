
package parcialventalotes;

public class ParcialVentaLotes {

  
    public static void main(String[] args) {
        Barrio B=new Barrio("Los Teros", 6, 9);
        
        B.agregarComprador(new Comprador(1234, "Pepe1", "Argento1", "La Plata"), 0, 0);
        B.agregarComprador(new Comprador(12345, "Pepe2", "Argento2", "La Plata"), 0, 1);
        B.agregarComprador(new Comprador(12346, "Pepe3", "Argento3", "La Plata"), 0, 2);
        B.agregarComprador(new Comprador(12347, "Pepe4", "Argento4", "La Plata"), 0, 3);
        B.agregarComprador(new Comprador(12348, "Pepe5", "Argento5", "La Plata"), 0, 4);
        B.agregarComprador(new Comprador(77777, "vegetta", "777", "Planeta vegatta"), 3, 3);
        
        
        B.incrementarP(0, 20);
        System.out.println(B.toString());
    }
    
}
