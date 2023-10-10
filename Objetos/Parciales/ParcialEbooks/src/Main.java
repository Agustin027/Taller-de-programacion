public class Main {

    public static void main(String[] args) {
      Ebooks Eb = new Ebooks("Epub", 50, "El libro de pepe",700);
      LibroImpreso Lb = new  LibroImpreso(true,"El libro de pepe 2" , 700);
      
      Eb.agregarAutor("pepe1");
      Eb.agregarAutor("pepe2");
      Eb.agregarAutor("pepe3");
      
      
      Lb.agregarAutor("pepe1");
      Lb.agregarAutor("pepe2");
      Lb.agregarAutor("pepe3");
      
      
      
        System.out.println(Eb);
        System.out.println(Lb);
      
      
      
    }
    
}
