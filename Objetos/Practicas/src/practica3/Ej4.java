package practica3;
import PaqueteLectura.GeneradorAleatorio;
public class Ej4 {
    
        public static void main(String[] args) {
            GeneradorAleatorio.iniciar();
            int dimF=10;
            Hotel  v = new Hotel(dimF);
           
            for (int i = 0; i < 5; i++) {
                 Cliente C = new Cliente();
              v.ingresaCliente(C, GeneradorAleatorio.generarInt(dimF));
            }
           
            for(int i=0; i<dimF; i++){
                     System.out.println(v.toString(i));
             }
             
           // v.aumentarValor(1000);
          
             for(int i=0; i<dimF; i++){
                    //esto esta mal
                    v.getV()[i].aumentarMonto(1000);
             }
             
            
              System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
              for(int i=0; i<dimF; i++){
                System.out.println(v.toString(i));
              }
    }
}
