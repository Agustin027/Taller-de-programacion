package pracialescueladecanto;


public class Concurso {
    int cantCateg;
    int cantMaxCanciones;
    canciones [][] mCanciones;

    public Concurso(int cantCateg, int cantMaxCanciones) {
        this.cantCateg = cantCateg;
        this.cantMaxCanciones = cantMaxCanciones;
        mCanciones= new canciones[cantCateg][cantMaxCanciones];
        for (int i = 0; i < cantCateg; i++) {
            for (int j = 0; j < cantMaxCanciones; j++) {
                mCanciones[i][j]=null;
            }
            
        }
    }
    
    
    public void AgregarCancion(canciones C, int categoria){
       int i = 0;
       while( mCanciones[categoria][i]!=null){
           i++;
       }
    mCanciones[categoria][i]=C;
    
    }

    public void InterpretarunaCancion(int identfC,Estudiante E,double p){
        boolean encontre=false;
        int categorias =0;
        int canciones =0;
        while(!encontre){
            canciones=0;
             while(!encontre && canciones<cantMaxCanciones){
                 if (  mCanciones[categorias][canciones] !=null && mCanciones[categorias][canciones].getIdentificador()==identfC) {
                     encontre=true;
                     mCanciones[categorias][canciones].InterpretarCancion(E, p);
                     System.out.println(mCanciones[categorias][canciones]);
                 }
                 canciones++;
             }
             categorias++;
        }

    }
    
   
    public Estudiante ConocerEstudiante(int identificador){
      int canciones=0;
      int categorias=0;
      Estudiante aux=null;
      boolean encontre=false;
        while(!encontre && categorias<cantCateg){
            canciones=0;
            while( !encontre && mCanciones[categorias][canciones] != null  && canciones<cantMaxCanciones  ){
                if(mCanciones[categorias][canciones].getIdentificador()==identificador){
                    aux=mCanciones[categorias][canciones].getGanador();
                    encontre=true;
                }
                    
                canciones++;
            }
         categorias++;
        }
        
        return aux;
    }
    
    public canciones CancionConMasPuntaje(int Categ){
        double max=-1;
        canciones maxC=null;
        for (int i = 0; i < cantMaxCanciones; i++) {
            if ( mCanciones[Categ][i]!=null &&mCanciones[Categ][i].getPuntaje()>max) {
                max=mCanciones[Categ][i].getPuntaje();
                maxC=mCanciones[Categ][i];
            }
        }
        
        return maxC;
    }
    
    
}