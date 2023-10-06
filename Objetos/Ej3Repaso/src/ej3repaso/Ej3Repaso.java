package ej3repaso;


public class Ej3Repaso {


    public static void main(String[] args) {
    
         // Crear un evento ocasional
                EventoOcasional eventoOcasional = new EventoOcasional("Show de tv", "Fundación ABC", "15/10/2023", "BandaX", 10);


                // Agregar temas a los recitales
                eventoOcasional.agregarTema("Tema 1");
                eventoOcasional.agregarTema("Tema 2");
                eventoOcasional.agregarTema("Tema 3");
                eventoOcasional.agregarTema("Tema 4");
            // Agregar más temas según sea necesario...

        
         // Crear una gira
               Gira gira = new Gira("Gira Mundial 2023", 10, "BandaY", 12);



                gira.agregarTema("Tema A");
                gira.agregarTema("Tema B");
                gira.agregarTema("Tema c");
                gira.agregarTema("Tema D");
            // Agregar más temas según sea necesario...

        // Agregar fechas a la gira
        gira.agregarFecha(new Fecha("Ciudad A", "10/11/2023"));
        gira.agregarFecha(new Fecha("Ciudad B", "15/11/2023"));
        gira.agregarFecha(new Fecha("Ciudad C", "20/11/2023"));
        gira.agregarFecha(new Fecha("Ciudad D", "25/11/2023"));
        gira.agregarFecha(new Fecha("Ciudad E", "30/11/2023"));
        gira.agregarFecha(new Fecha("Ciudad E", "30/11/2023"));


        // Calcular y mostrar el costo de ambos recitales
        int costoEventoOcasional = eventoOcasional.calcularCosto();
        int costoGira = gira.calcularCosto();

        System.out.println("Costo del evento ocasional: $" + costoEventoOcasional);
        System.out.println("Costo de la gira: $" + costoGira);

        // Invocar el método actuar para ambos recitales
        System.out.println("\nActuación del evento ocasional:");
        eventoOcasional.actuar();

        for (int i = 0; i < gira.getDimL(); i++) {
             System.out.println("\nActuación de la gira:");
                 gira.actuar();
        }
       
      
    }
    
}
