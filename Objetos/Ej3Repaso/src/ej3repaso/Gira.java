
package ej3repaso;

public class Gira extends Recitales{
    private String nombreG;
    private Fecha [] fechas;
    private int dimL;
    private int dimF;
    private int  fechaA;

    public Gira(String nombreG, int dimF, String nombreB, int dimFR) {
        super(nombreB, dimFR);
        this.nombreG = nombreG;
        this.dimF = dimF;
        fechas = new Fecha [dimF];
        for (int i = 0; i < dimF; i++) {
            fechas[i]=null;
        }
        dimL=0;
        fechaA=0;
    }

   

    public String getNombreG() {
        return nombreG;
    }

  

    public Fecha[] getFechas() {
        return fechas;
    }

 

    public int getDimL() {
        return dimL;
    }

    
    public int getDimF() {
        return dimF;
    }

   
    
  
     public void actuar(){
         System.out.println("Buenas noches "+fechas[fechaA].getCiudad());
         super.actuar();  
         fechaA++;
   }
    
     public void agregarFecha(Fecha F){
         if(dimL<dimF){
           fechas[dimL]=F;
           dimL++;
       }
       else
           System.out.println("No se puede agregar");
   }
    
       public int calcularCosto(){
        return dimL*30000;
    }
    
    
}
