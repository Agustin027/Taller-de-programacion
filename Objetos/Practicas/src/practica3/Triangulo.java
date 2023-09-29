package practica3;

public class Triangulo {
    private double lado1;

    public Triangulo(double lado1, double lado2, double lado3, String relleno, String colorL) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.relleno = relleno;
        this.colorL = colorL;
    }
    private double lado2;
    private double lado3;
    private String relleno;
    private String colorL;
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

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getColorL() {
        return colorL;
    }

    public void setColorL(String colorL) {
        this.colorL = colorL;
    }
  
    public double toPerimetro(){
        double total;
        total= lado1+lado2+lado3;
        return(total);
    }
    
     public double toArea(){
        double semiperimetro = (lado1 + lado2 + lado3) / 2.0;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
       return(area);
        
    }
    
}




  


