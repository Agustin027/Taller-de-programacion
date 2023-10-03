package practica3;
import PaqueteLectura.GeneradorAleatorio;
public class Habitacion {
    private double costoNoche;
    private boolean estaOcupada;
    private Cliente c;

//constructores--------------------------------
    public Habitacion( boolean estaOcupada, Cliente c) {
        this.estaOcupada = estaOcupada;
        if (estaOcupada){
        this.c = c;
        }
    }

    public Habitacion (){
        GeneradorAleatorio.iniciar();
        this.costoNoche=GeneradorAleatorio.generarDouble(6000)+2000;
        this.estaOcupada= false;
    }

//getters y setters--------------------------------

    public double getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(double costoNoche) {
        this.costoNoche = costoNoche;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
 //Metodos--------------------------------

    public void reservaC( Cliente c) {
            if (!estaOcupada){
                this.c = c;
                estaOcupada=true;
            }
        }
    public void aumentarMonto(double monto) {
        System.out.println("ingresa a aumentar monto");
    costoNoche += monto;
}

    @Override
    public String toString() {
        if(estaOcupada)
        return " {" + "costoNoche: " + costoNoche + ", estaOcupada: " + estaOcupada + ", cliente: " + c + '}';
        else
         return " {" + "costoNoche: " + costoNoche + ", estaOcupada: " + estaOcupada + '}';

    }




}