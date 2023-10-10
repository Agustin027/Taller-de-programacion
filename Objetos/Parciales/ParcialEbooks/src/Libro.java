public abstract class Libro {
    private String titulo;
    private double precioBase;
    private int dimF=8;
    private int dimL;
    private String [] Vautores=new String[dimF];

    public Libro(String titulo, double precioBase) {
        this.titulo = titulo;
        this.precioBase = precioBase;
        dimL=0;
        for (int i = 0; i < dimF; i++) {
            Vautores[i]=null;
        }
    }

    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    
   
    public void agregarAutor(String nombre){
        Vautores[dimL]=nombre;
        dimL++;
    }
    
    
    
    public double precioFinal(){
        return precioBase*1.21;
        
    }

    @Override
    public String toString() {
        return "titulo: " + titulo +" Precio final: "+precioFinal() +" Nombre del 1er autor "+Vautores[0];
        
    }

    
    
}
