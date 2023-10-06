
package ej4repaso;


public class CoroSemicircular extends Coro{
 private Corista [] VCoristas;
 private int dimF;
 private int dimL;

    public CoroSemicircular(int dimF, String nombre, Director d) {
        super(nombre, d);
        this.dimF = dimF;
        VCoristas=new Corista[dimF];
        for (int i = 0; i < dimF; i++) {
            VCoristas[i]=null;
            
        }
        dimL=0;
    }

    @Override
    public void agregarCorista(Corista C) {
       if(!estalleno()){
            VCoristas[dimL]=C;
            dimL++;
       }
        else
            System.out.println("El coro esta lleno");
    }

    @Override
    public boolean estalleno() {
        return (dimL>=dimF);
    }

    @Override
    public boolean estaBienFormado() {
        for (int i = 0; i < dimL-1; i++) {
            if (VCoristas[i].getTonoF() < VCoristas[i+1].getTonoF() ) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String aux=super.toString()+"\n";
        
        for (int i = 0; i < dimF; i++) {
            aux+= "corista nro: "+i +VCoristas[i]+"\n";    
        }
        
        
        return aux;
    }
    
    
 
 
    
   
    

    
}
