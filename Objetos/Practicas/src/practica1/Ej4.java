package practica1;

import PaqueteLectura.Lector;

public class Ej4 {
    public static void main(String[] args) {
        int[][] oficinas = new int[8][4];

    
        System.out.println("ingresar numero de oficina");
        int piso = Lector.leerInt();
        int nOf;
        while(piso!=9){
              System.out.println("ingresar numero de oficina");
                nOf=Lector.leerInt();
                oficinas[piso-1][nOf-1] = oficinas[piso-1][nOf-1]+1;
            
           
                System.out.println("ingresar numero de piso");
                piso = Lector.leerInt();
        }
        
        for (int i=0;i<8;i++)
            for(int j=0;j<4;j++)
                System.err.println("La Oficina. " + (i+1) + ","  +  (j+1)  + " tiene"  +oficinas[i][j]);
        
    }
    
}
