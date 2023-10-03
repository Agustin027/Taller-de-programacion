package practica4;

public class Entrenadores extends Empleado{
    private int cantCampeonatosG;

    public Entrenadores(int cantCampeonatosG, String nombre, double sueldo, int antiguedad) {
        super(nombre, sueldo, antiguedad);
        this.cantCampeonatosG = cantCampeonatosG;
    }
    
    
    
    
    
    
    public double calcularEfectividad(){
    
    return((double)cantCampeonatosG/getAntiguedad());
}
   
       public double calcularSueldoACobrar(){
           double monto = super.calcularSueldoACobrar();
           if (cantCampeonatosG>10)
               monto+=50000;
           else if(cantCampeonatosG>4)
               monto+=30000;
           else if(cantCampeonatosG>0)
               monto+=5000;
           
    return(monto);
}
    @Override
    public String toString(){
        return (super.toString()+"/ Sueldo a cobrar: "+this.calcularSueldoACobrar()+"/ Su efectividad es del "+this.calcularEfectividad());
    }
   
}
