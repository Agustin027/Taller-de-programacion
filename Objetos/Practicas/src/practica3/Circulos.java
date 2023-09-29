package practica3;

public class Circulos {
    private double radio;
    private String relleno;
    private String colorL;

    public Circulos(double radio, String relleno, String colorL) {
        this.radio = radio;
        this.relleno = relleno;
        this.colorL = colorL;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
    
    public double calcularP(){
        return (Math.PI*radio*2);
    }
     public double calcularA(){
        return (Math.PI*radio*radio);
    }
}
