
package ej1repaso;


public class Ej1Repaso {

    public static void main(String[] args) {
       // Crear un proyecto
        Proyecto proyecto = new Proyecto("Proyecto de Investigación", 123, "PEPE");

        // Crear tres investigadores
        Investigador investigador1 = new Investigador("Investigador 1", 3, "Especialidad 1");
        Investigador investigador2 = new Investigador("Investigador 2", 4, "Especialidad 2");
        Investigador investigador3 = new Investigador("Investigador 3", 5, "Especialidad 3");

        // Agregar los investigadores al proyecto
        proyecto.agregarInvestigador(investigador1);
        proyecto.agregarInvestigador(investigador2);
        proyecto.agregarInvestigador(investigador3);

        // Crear dos subsidios para cada investigador
        Subsidio subsidio1 = new Subsidio(1000.0, "Motivo 1");
        Subsidio subsidio2 = new Subsidio(1500.0, "Motivo 2");
        Subsidio subsidio3 = new Subsidio(800.0, "Motivo 3");
        Subsidio subsidio4 = new Subsidio(1200.0, "Motivo 4");
        Subsidio subsidio5 = new Subsidio(2000.0, "Motivo 5");
        Subsidio subsidio6 = new Subsidio(900.0, "Motivo 6");

        // Agregar subsidios a los investigadores
        investigador1.agregarSubsidio(subsidio1);
        investigador1.agregarSubsidio(subsidio2);
        investigador2.agregarSubsidio(subsidio3);
        investigador2.agregarSubsidio(subsidio4);
        investigador3.agregarSubsidio(subsidio5);
        investigador3.agregarSubsidio(subsidio6);

        // Otorgar todos los subsidios de investigador1
        investigador1.otorgarTodos();

        // Imprimir todos los datos del proyecto
        System.out.println(proyecto.toString());
    }
    }
    

