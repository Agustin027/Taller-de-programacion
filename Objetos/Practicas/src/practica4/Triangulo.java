
package practica4;

public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String unCR, String unCL, double lado1,double lado2,double lado3) {
        super(unCR, unCL);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    
    
    
    
    
    
    public double calcularPerimetro(){
        double total;
        total= lado1+lado2+lado3;
        return(total);
    }
    public double calcularArea(){
       double semiperimetro = (lado1 + lado2 + lado3) / 2.0;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
       return(area);
    }

    @Override
    public String toString() {
        
        return super.toString()+ " lado1=" + getLado1() + ", lado2=" + getLado2()  + ", lado3=" + getLado3() ;
    }
 
    
}
