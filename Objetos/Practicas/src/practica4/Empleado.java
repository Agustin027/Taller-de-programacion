package practica4;

public abstract class Empleado {
    private String nombre;
    private double sueldo=600;
    private int antiguedad;

    public Empleado(String nombre, double sueldo, int antiguedad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
     public double calcularSueldoACobrar(){
        
         return((getSueldo())+(  getSueldo()/10*getAntiguedad() ));
     }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + '}';
    }
    
    
    
    
    
    
    
    
    public abstract double calcularEfectividad();
}
