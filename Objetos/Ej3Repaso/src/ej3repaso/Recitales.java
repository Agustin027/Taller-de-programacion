/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3repaso;

public abstract class Recitales {
    private String nombreB;
    private String [] vTemas;
    private int dimF;
    private int dimL;

    public Recitales(String nombreB, int dimF) {
        this.nombreB = nombreB;
        this.dimF = dimF;
         vTemas=new String[dimF];
        for (int i = 0; i < dimF; i++) {
            vTemas[i]=null;
        }
    }

  

    public String getNombreB() {
        return nombreB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }

    public String[] getvTemas() {
        return vTemas;
    }

    public int getDimF() {
        return dimF;
    }

    public int getDimL() {
        return dimL;
    }

   public void agregarTema(String Tema){
       if(dimL<dimF){
           vTemas[dimL]=Tema;
           dimL++;
       }
       else
           System.out.println("No se puede agregar");
       
   }
     public  void actuar(){
         for (int i = 0; i < dimL; i++) {
             System.out.println("Ahora tocaremos: "+vTemas[i]);
             
         }
       
   }
  
     public abstract int calcularCosto();
    
}
