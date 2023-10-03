package practica4;

public class Jugador extends Empleado{
    private int nroPartidos;
     private int nroGoles;

    public Jugador(int nroPartidos, int nroGoles, String nombre, double sueldo, int antiguedad) {
        super(nombre, sueldo, antiguedad);
        this.nroPartidos = nroPartidos;
        this.nroGoles = nroGoles;
    }
    
    
 
  public  double calcularEfectividad(){
      return((double)nroGoles/nroPartidos);
  }
    public  double calcularSueldoACobrar(){
        if (calcularEfectividad()>0.5) 
            return (super.calcularSueldoACobrar()+getSueldo());
          else
            return  (super.calcularSueldoACobrar());
        }

@Override
    public String toString(){
        return (super.toString()+"/ Sueldo a cobrar: "+this.calcularSueldoACobrar()+"/ Su efectividad es del "+this.calcularEfectividad());
    }
    
    
    
    }
