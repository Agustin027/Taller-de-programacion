package practica1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej1 {

    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF = 11;
        int[] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i = 0; i < DF; i++)
            tabla2[i] = 2 * i;

        int num = GeneradorAleatorio.generarInt(12);
        while (num != 11) {
            System.out.println(" " + tabla2[num]);
            num = GeneradorAleatorio.generarInt(12);
        }
    }

}
