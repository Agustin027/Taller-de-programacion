
package psicologo;


public class Psicologo {
    private final int dias=5;
    private final int turno=6;
    private Paciente [][] agendaP;

    public Psicologo() {
        agendaP=new Paciente[dias][turno];
        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < turno; j++) {
                agendaP[i][j]=null;
            }
            
        }
    }
    
    public void agendarPaciente(int D,int T,Paciente P){
        agendaP[D][T]=P;
    }

    public String liberarDia(int D){
       String aux="";
        for (int i = 0; i < turno; i++) {
            if(agendaP[D][i]!=null)
                aux+=agendaP[D][i].getNombre()+"\n";
            agendaP[D][i]=null;
            
        }

       return aux;
    } 
    
    
    public double recaudacion(){
        int aux=0;
        
        for (int i = 0; i < dias; i++) {
            for (int j = 0; j < turno; j++) {
                if(agendaP[i][j]!=null)
                    aux+=agendaP[i][j].getCostoxSesion();
            }
            
        }
        
        
        return aux;
    }
  
}
