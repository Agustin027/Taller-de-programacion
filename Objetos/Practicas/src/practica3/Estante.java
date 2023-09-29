package practica3;

public class Estante {
    private Libro [] v ;
    private int dimF =20;
    private int dimL=0;

    public Estante() {
        this.v= new Libro [dimF];
        
    }

   
    public void setV(Libro[] v) {
        this.v = v;
    }

    
public void setDimL(int dimL) {
        this.dimL = dimL;
    }

    
    
    public String Cantlibros(){
        return("hay "+dimL+" libros ");
    }
      public String Estalleno(){
      
       if (dimL==dimF)
        return("esta lleno");
       else
       return("esta vacio");
    }
   
      public void agregarLibro(Libro l){
          if(dimL<dimF){
              v[dimL]=l;
              dimL++;
          }
          else
            System.out.println("El estante está lleno, no se puede agregar más libros.");
          
      }
      
      public Libro DevolverLibro(String titulo){
          Libro l=new Libro();
          for (int i = 0; i < dimL; i++){
              if( this.v[i] !=null  && this.v[i].getTitulo().equals(titulo))
                l=this.v[i];
          }
          return l;
      }
      
   
    
}
