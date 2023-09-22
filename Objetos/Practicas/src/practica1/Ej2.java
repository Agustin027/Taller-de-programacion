package practica1;

import PaqueteLectura.Lector;

public class Ej2 {
    public static void main(String[] args) {
        int DF = 15;
        double[] alturas = new double[DF];
        int i;
        double totalAlt = 0;
        for (i = 0; i < DF; i++) {
            System.out.println("Ingrese altura");
            alturas[i] = Lector.leerDouble();
            totalAlt = totalAlt + alturas[i];
        }
        double prom = totalAlt / DF;
        int cant = 0;
        for (i = 0; i < DF; i++)
            if (alturas[i] > prom)
                cant++;
        System.out.println("La altura promedio es: " + prom);
        System.out.println("La cantidad de alumnos con altura mayor al promedio es: " + cant);
    }
}
