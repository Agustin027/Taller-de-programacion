
package ej1repaso;


public class Proyecto {
    private String nombreProyecto;
    private int codigo;
    private String nombreDirector;
    private Investigador []  Vinvestigadores;
    private int dimF =50;
    private int cantinv;
        

    public Proyecto(String nombreProyecto, int codigo, String nombreDirector) {
        this.nombreProyecto = nombreProyecto;
        this.codigo = codigo;
        this.nombreDirector = nombreDirector;
        cantinv=0;
         Vinvestigadores = new Investigador[dimF];
        for (int i = 0; i < 50; i++) {
            Vinvestigadores[i]= null;
        }
    }
    
     public void agregarInvestigador(Investigador unInvestigador){
         
         if (cantinv < dimF){
              Vinvestigadores[cantinv]=unInvestigador;
               cantinv++;
         }
         else
             System.out.println("no se puede ingresar un investigador");
        
    }
    
    
       public double dineroTotalOtorgado(){
        double total = 0;
        
        for (int i = 0; i < cantinv; i++) {
            total += Vinvestigadores[i].dineroTotalOtorgado();
        }
       
        return total;
    }
       
       public void otorgarTodos(String nombre_completo){
           int i =0;
       while( (i <cantinv) &&( !nombre_completo.equalsIgnoreCase(Vinvestigadores[i].getNombreC())) ){
           
           
                    
           i++;
       }
           
           if(i < cantinv)
               Vinvestigadores[i].otorgarTodos();
           else
               System.out.println("no se encontro a un investigador con ese nombre");
           
           
       }

    @Override
    public String toString() {
       
        String aux ="Proyecto{" + "nombreProyecto= " + nombreProyecto + ", codigo= " + codigo + ", nombreDirector= " + nombreDirector +"Dinero Total: "+ dineroTotalOtorgado()+ "\n";
        
        
         for (int i = 0; i < cantinv; i++) {
        aux += Vinvestigadores[i].toString() + "\n";
    }
        
             return (aux);
           
    }
       
       
    
}
