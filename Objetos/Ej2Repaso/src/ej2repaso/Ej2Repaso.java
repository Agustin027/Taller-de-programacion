
package ej2repaso;

import PaqueteLectura.Lector;
public class Ej2Repaso {

   
    public static void main(String[] args) { // Crear un estacionamiento con 3 pisos y 3 plazas por piso
        Estacionamiento estacionamiento = new Estacionamiento("Mi Estacionamiento", "Mi Dirección", "8:00", "21:00", 3, 5);

        // Registrar 6 autos en el estacionamiento en lugares diferentes
        estacionamiento.registrarAuto(new Auto("Dueño1", "ABC123"), 1, 1);
        estacionamiento.registrarAuto(new Auto("Dueño2", "DEF456"), 1, 2);
        estacionamiento.registrarAuto(new Auto("Dueño3", "GHI789"), 1, 3);
        estacionamiento.registrarAuto(new Auto("Dueño4", "JKL012"), 2, 1);
        estacionamiento.registrarAuto(new Auto("Dueño5", "MNO345"), 2, 2);
        estacionamiento.registrarAuto(new Auto("Dueño6", "PQR678"), 2, 3);

        // Mostrar la representación del estacionamiento en consola
        System.out.println("Representación del Estacionamiento:");
        System.out.println(estacionamiento);

        // Mostrar la cantidad de autos ubicados en la plaza 1
        int cantidadEnPlaza1 = estacionamiento.cantY(1);
        System.out.println("Cantidad de autos en Plaza 1: " + cantidadEnPlaza1);

        // Leer una patente por teclado e informar si el auto se encuentra en el estacionamiento
        System.out.print("Ingrese una patente: ");
        String patente = Lector.leerString();
        String ubicacion = estacionamiento.buscarPatente(patente);
        System.out.println(ubicacion);
    }
        
    
    
}







