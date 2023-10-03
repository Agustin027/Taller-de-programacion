package practica4;
public class  Trabajadores extends Persona{
    private String Tarea;

    public Trabajadores(String Tarea, String unNombre, int unDNI, int unaEdad) {
        super(unNombre, unDNI, unaEdad);
        this.Tarea = Tarea;
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String Tarea) {
        this.Tarea = Tarea;
    }

    
    
    
    @Override
    public String toString() {
        return super.toString() + "'soy :"+getTarea(); 
    }

    
    
    
    
   
    
}
