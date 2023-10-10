
package psicologo;


public class Main {
    public static void main(String[] args) {
        Psicologo agendapsi= new Psicologo();
        
        
        
        agendapsi.agendarPaciente(0, 0, new Paciente("Juan1", true, 100));
        agendapsi.agendarPaciente(0, 1, new Paciente("Juan2", true, 100));
        agendapsi.agendarPaciente(0, 2, new Paciente("Juan3", true, 100));
        agendapsi.agendarPaciente(3, 0, new Paciente("Pepe1", true, 100));
        agendapsi.agendarPaciente(3, 1, new Paciente("Pepe2", true, 100));
        agendapsi.agendarPaciente(3, 2, new Paciente("Pepe3", false, 600));
        agendapsi.agendarPaciente(3, 3, new Paciente("Pepe4", false, 600));
        agendapsi.agendarPaciente(3, 4, new Paciente("Pepe5", true, 100));
        agendapsi.agendarPaciente(3, 5, new Paciente("Pepe6", true, 100));
       
        
        System.out.println(agendapsi.liberarDia(0));  
        
        
        System.out.println("-----------------------------------------");
       
        System.out.println(agendapsi.recaudacion());
        
        
    }
    
}
