package practica3;
import PaqueteLectura.GeneradorAleatorio;
public class Cliente {
    private String nombre;
    private int dni;
    private int edad;

    public Cliente(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Cliente(){
        GeneradorAleatorio.iniciar();
        nombre=GeneradorAleatorio.generarString(5);
        dni=GeneradorAleatorio.generarInt(30000000)+20000000;
        edad=GeneradorAleatorio.generarInt(100)+18;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + '}';
    }


}