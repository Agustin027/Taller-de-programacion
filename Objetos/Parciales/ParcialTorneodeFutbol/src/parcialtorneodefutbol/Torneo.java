
package parcialtorneodefutbol;


public class Torneo {
    private String nombre;
    private Goleador [][] tablaGoleador;
    private int [] contGoleador;
    private int N;
    private int M;

    public Torneo(String nombre, int N, int M) {
        this.nombre = nombre;
        this.N = N;
        this.M = M;
        tablaGoleador=new Goleador[N][M];
        contGoleador= new int [M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tablaGoleador[i][j]=null;
            }
            
        }
        
        for (int i = 0; i < M; i++) {
            contGoleador[i]=0;
        }
    }
    
    public void agregarGoleador(int X,Goleador G){
        int i=0;
        while(tablaGoleador[X][i]!=null){
            i++;
        }
        tablaGoleador[X][i]=G;
        contGoleador[X]++;
    }
    public Goleador GoleadorMenosGoles(int X){
        int min=999;
        Goleador aux=null;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < contGoleador[i]; j++) {
                if(tablaGoleador[i][j].getCantGoles()<min){
                    aux=tablaGoleador[i][j];
                    min=tablaGoleador[i][j].getCantGoles();
                }
            }
            
        }
        return aux;
    }
    
    public int CantGoleadores(){
        int aux=0;
        
          for (int i = 0; i < N; i++) {
               aux+=contGoleador[i];
            }
             
        return aux;
    }

    @Override
    public String toString() {
        String aux="Torneo 2022 " +nombre+ " \n";
        aux +="----------------------------------------------------------------"+" \n";
        
        for (int i = 0; i < N; i++) {
            aux+="fecha "+i;
            for (int j = 0; j < contGoleador[i]; j++) {
                aux+=" |cantidad de goleadores de la fecha:  "+contGoleador[i]+"|   |"+tablaGoleador[i][j]+"|";
            }
            aux+="\n";
        }
        
         aux +="----------------------------------------------------------------"+" \n";
        
        
        return aux;
    }
    
    
    
}
