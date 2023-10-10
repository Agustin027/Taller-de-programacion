
package parcialventalotes;

public class Lote {
    double precio;
    Comprador C;

    public Lote() {
        precio=50000;
        C=null;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Comprador getC() {
        return C;
    }

    public void setC(Comprador C) {
        this.C = C;
    }
    
    
    public void aumetar(double P){
        precio+= precio * (P/100);
    }

    @Override
    public String toString() {
        if(C!=null)
        return "|precio=" + precio + ", Comprador " + C + '|';
        else
            return precio + " Disponible para la venta ";
    }
    
    
    
}
