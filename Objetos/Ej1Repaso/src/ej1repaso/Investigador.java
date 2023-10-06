/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1repaso;

public class Investigador {
    private String nombreC;
    private int Categ;
    private String especialidad;
    private Subsidio  [] VSubsidio;
     private int dimF=5;
    private int cantsub=0;

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getCateg() {
        return Categ;
    }

    public void setCateg(int Categ) {
        this.Categ = Categ;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Subsidio[] getVSubsidio() {
        return VSubsidio;
    }

    public void setVSubsidio(Subsidio[] VSubsidio) {
        this.VSubsidio = VSubsidio;
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }

    public int getCantsub() {
        return cantsub;
    }

    public void setCantsub(int cantsub) {
        this.cantsub = cantsub;
    }

    
    public Investigador(String nombreC, int Categ, String especialidad) {
        this.nombreC = nombreC;
        this.Categ = Categ;
        this.especialidad = especialidad;
        VSubsidio = new Subsidio[dimF];
        for (int i = 0; i < dimF; i++) {
            VSubsidio[i]=null;
        }
    }
    
   
    public void agregarSubsidio(Subsidio unSubsidio){
        if (cantsub < dimF){
            VSubsidio[cantsub]=unSubsidio;
            cantsub++;
        }
        else
            System.out.println("no se puede ingresar un subsidio");
    }
    
     public double dineroTotalOtorgado(){
         double total=0;
         for (int i = 0; i < cantsub; i++) {
             if(VSubsidio[i].getFueOtorgado())
            total+= VSubsidio[i].getMonto();
             else{
                 System.out.println(nombreC+" el subsidio "+i+" no fue otorgado");
             }
         }
         return total;
     }
    
     public void otorgarTodos(){
         for (int i = 0; i < cantsub; i++) {
             VSubsidio[i].setFueOtorgado(true);
             
         }
        
         
     }

    @Override
    public String toString() {
        return "Investigador{" + "nombreC=" + nombreC + ", Categ=" + Categ + ", especialidad=" + especialidad +"dineroT: "+dineroTotalOtorgado()+ '}';
    }

    
  
     
     
     
}
