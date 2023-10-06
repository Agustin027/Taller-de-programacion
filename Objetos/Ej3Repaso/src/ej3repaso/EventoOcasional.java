
package ej3repaso;

public class EventoOcasional extends Recitales {
    private String motivo;
    private String nContratante;
    private String dia;

    public EventoOcasional(String motivo, String nContratante, String dia, String nombreB, int dimF) {
        super(nombreB, dimF);
        this.motivo = motivo;
        this.nContratante = nContratante;
        this.dia = dia;
    }

  

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getnContratante() {
        return nContratante;
    }

    public void setnContratante(String nContratante) {
        this.nContratante = nContratante;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

 
     public void actuar(){
         if(motivo.equalsIgnoreCase("beneficio")){
             System.out.println("Recuerden colaborar con "+nContratante);
         }
         else if (motivo.equalsIgnoreCase("Show de Tv")){
             System.out.println("Saludos amigos televidentes");
         }     
             else
                    System.out.println("Un feliz cumpleaños para "+ nContratante);
       super.actuar();
      }
   
         public int calcularCosto(){
        int costo;

        if (getMotivo().equalsIgnoreCase("beneficio")){
            costo=0;
        }
            else if (getMotivo().equalsIgnoreCase("Show de TV")){
                costo= 50000;
            }
            else {
                costo= 150000;
            }
        return costo;
    }
    
    
}
