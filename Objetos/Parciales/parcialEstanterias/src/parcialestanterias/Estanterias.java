
package parcialestanterias;

public class Estanterias {
    private Libro [][] estanteria;
    private int N;
    private int M;

    public Estanterias(int N, int M) {
        this.N = N;
        this.M = M;
        
        this.estanteria= new Libro[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                this.estanteria[i][j]=null;
            }
        }
        
    }
    
    public void almacenarLibro(Libro L, int N, int M){
        this.estanteria[N][M]=L;
    }
    
    public Libro sacarLibro(String titulo){
        Libro L;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if( estanteria[i][j]!=null && estanteria[i][j].getTitulo().equalsIgnoreCase(titulo)){
                        L=estanteria[i][j];
                        estanteria[i][j]=null;
                        return(L);
                    }
                        
                }
        }
        return (new Libro("xxxx", "xxxx", 0));
    }
   
    
    public Libro calcular(){
        double max = -1;
        Libro lmax=null;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if( estanteria[i][j]!=null   && estanteria[i][j].getPeso()>max ){
                    max=estanteria[i][j].getPeso();
                    lmax=estanteria[i][j];
                }
            }
            
        }
        return lmax;
    }
    
}
