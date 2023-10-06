/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4repaso;


public class CoroHileras extends Coro {
    private Corista [][] MCoristas;
    private int hileras;
    
      private int filadimL;
     private int columnadimL;
   private int dimL;

    public CoroHileras(int h, String nombre, Director d) {
        super(nombre, d);
        this.hileras=h;
        filadimL=0;
        columnadimL=0;
        MCoristas= new Corista[hileras][hileras];
        for (int i = 0; i < hileras; i++) {
            for (int j = 0; j < hileras; j++) {
                MCoristas[i][j]=null;
            }
            
        }
    }

    @Override
    public void agregarCorista(Corista C) {
       if (!estalleno()){
           
           for (int i = 0; i < hileras; i++) {
               for (int j = 0; j <hileras; j++) {
                   if (MCoristas[i][j]==null){
                       MCoristas[i][j]=C;
                       return;
                   }
               }    
           }
           
       }
        else
            System.out.println("El coro esta lleno");
        
    }

    @Override
    public boolean estalleno() {
        for (int i = 0; i < hileras; i++) {
            for (int j = 0; j < hileras; j++) {
                if (MCoristas[i][j]==null) {
                    return false;
                }
            }
        }
     return true;
    }

    @Override
    public boolean estaBienFormado() {
       
        for (int i = 0; i < filadimL; i++) {    
            for (int j = 0; j < columnadimL-1; j++) {
               if( MCoristas[i][j].getTonoF()!= MCoristas[i][j+1].getTonoF())
                   return false;
            }
        }
         
        
        for (int i = 0; i < filadimL-1; i++) {
            if (MCoristas[i][0].getTonoF() < MCoristas[i+1][0].getTonoF() ) {
                return false; 
            }
        }
        
        
        
        return true;
    }

    @Override
    public String toString() {
        String aux= super.toString();
        
        for (int i = 0; i < hileras; i++) {
            aux+= "\n"+ "Fila: "+ i+ " ";
            for (int j = 0; j < hileras; j++) {
                aux+=MCoristas[i][j]+" ";
            }
              aux+= "\n"; // Saltar a la siguiente fila
	}
        
        return aux; 
    }
    
   
  
    
}
