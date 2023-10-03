
package practica4;

public class Circulo extends Figura {
   private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String unCR, String unCL) {
        super(unCR, unCL);
        this.radio = radio;
    }

 public double calcularPerimetro(){
      return (Math.PI*radio*2);
    }
     public double calcularArea(){
        return (Math.PI*radio*radio);
    }

    @Override
    public String toString() {
        return  super.toString()+ " radio= " + radio;
    }
     
     

}
