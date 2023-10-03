package practica3;

public class Hotel {
private Habitacion [] v ;
private int dimF;
//constructores--------------------------------
    public Hotel(int dimF) {
        this.v = new Habitacion [dimF];
        for (int i = 0; i < dimF; i++) {
            v[i]= new Habitacion();
        }
    }



    public Habitacion[] getV() {
        return v;
    }
//getters y setters--------------------------------

    public void setV(Habitacion[] v) {
        this.v = v;
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }
 //Metodos--------------------------------
public void ingresaCliente(Cliente C, int X){
        v[X].reservaC(C);
    }

    public void aumentarValor(double monto){
       for (int i = 0; i < dimF; i++) {
           System.out.println("ingresa a aumentar valor");
           v[i].aumentarMonto(monto);
       }
   }
   
    public String toString(int i) {
        return "Hotel{" + "Habitacion " +i+ v[i] + '}';
    }


}







