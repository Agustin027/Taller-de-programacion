package pracialescueladecanto;

public class canciones {
    private String nombre;
    private String compositor;
    private int identificador;
    private Estudiante ganador=null;
    private double puntaje;

    public canciones(String nombre, String compositor, int identificador) {
        this.nombre = nombre;
        this.compositor = compositor;
        this.identificador = identificador;
        this.puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Estudiante getGanador() {
        return ganador;
    }

    public void setGanador(Estudiante ganador) {
        this.ganador = ganador;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
    public void InterpretarCancion(Estudiante E,double p){
        
        if(p>puntaje){
            puntaje=p;
            ganador=E;         
        }
        
    }

    @Override
    public String toString() {
        return "canciones{" + "nombre=" + nombre + ", compositor=" + compositor + '}';
    }
    
    
    
}
