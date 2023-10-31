
package parcialtetro;


public class Funcion {
    private String titulo;
    private String fecha;
    private String hora;
    private int filas;
    private int columnas;
    private Butaca [][] sala;

    public Funcion(String titulo, String fecha, String hora, int filas, int columnas) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.filas = filas;
        this.columnas = columnas;
        sala=new Butaca[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j]= new Butaca(800+(100*i),"butaca "+" i: "+i+"' J:"+j);
            }    
   
        }
    }
   
    public double OcuparButaca(int fila,int butaca){
        sala[fila][butaca].setEstaOcupada(true);
        return  sala[fila][butaca].getPrecio();
    }
    
    public void DesocuparButacas(int F){
        
        for (int i = 0; i < columnas; i++) {
            sala[F][i].setEstaOcupada(false);
        }
        
        
    }
    
    public String RepresentacionButacas(int B){
            String aux="";
            for (int i = 0; i < filas; i++) {
                aux+= sala[i][B]+"\n";
        }
            
            return aux;
        }

    @Override
    public String toString() {
        String aux="Funcion|" + "titulo=" + titulo + ", fecha=" + fecha + ", hora=" + hora +"'|"+"\n";
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux+= sala[i][j];
            }
            
        }
        
        return aux;
    }
        
    
    
    
    
}
 