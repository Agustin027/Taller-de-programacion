
public class LibroImpreso extends Libro{
    boolean esTapaDura;

    public LibroImpreso(boolean esTapaDura, String titulo, double precioBase) {
        super(titulo, precioBase);
        this.esTapaDura = esTapaDura;
    }

    
    public boolean isEsTapaDura() {
        return esTapaDura;
    }

    public void setEsTapaDura(boolean esTapaDura) {
        this.esTapaDura = esTapaDura;
    }
    
    
    
    
}
