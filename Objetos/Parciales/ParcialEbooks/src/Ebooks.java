
public class Ebooks extends Libro {
    private String formato;
    private double tamanio;

    public Ebooks(String formato, double tamanio, String titulo, double precioBase) {
        super(titulo, precioBase);
        this.formato = formato;
        this.tamanio = tamanio;
    }

    
    
    
    @Override
   public double precioFinal(){
        return super.precioFinal()+(2.5*tamanio);
    }
    
    
    
    
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

 

    
    
    
}
