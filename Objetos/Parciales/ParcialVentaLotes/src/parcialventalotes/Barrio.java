package parcialventalotes;

public class Barrio {
    String nombre;
    int N;
    int M;
    Lote [][] mLotes;

    public Barrio(String nombre, int N, int M) {
        this.nombre = nombre;
        this.N = N;
        this.M = M;
        mLotes=new Lote [N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mLotes[i][j]= new Lote();
            }
            
        }
    }
    
    
    public void agregarComprador(Comprador C,int Y,int X){
        mLotes[Y][X].setC(C);
    }
    
    public void incrementarP(int X, double P){
        for (int i = 0; i < M; i++) {
            if(mLotes[X][i].getC()==null){
              mLotes[X][i].aumetar(P);
            }
            
        }
    }
    
    public double montoTotal(){
        double aux=0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mLotes[i][j].getC()!=null) {
                     aux+= mLotes[i][j].getPrecio();
                }
            }
            
        }
        
        return aux;
    }

    @Override
    public String toString() {
        String aux="Barrio "+nombre+"\n"+"Recaudacion actual: "+montoTotal()+"\n";
        
        
        for (int i = 0; i < N; i++) {
           aux+="manzana #"+i+"|"+"\n";
            for (int j = 0; j < M; j++) {
                aux+="Lote #"+j +" "+mLotes[i][j];
            }
            aux+="\n";
        }
        
        return aux;
    }
    
    
    
    
    
}
