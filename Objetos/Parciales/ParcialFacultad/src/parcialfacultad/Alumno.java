
package parcialfacultad;

import sun.util.locale.provider.AuxLocaleProviderAdapter;

public abstract class  Alumno  {
    private int dni;
    private String nombre;
   private  int N;
   private  int diml;
   private Materias [] vMaterias;

    public Alumno(int dni, String nombre, int N) {
        this.dni = dni;
        this.nombre = nombre;
        this.N = N;
        vMaterias=new Materias[N];
        diml=0;
        for (int i = 0; i < N; i++) {
            vMaterias[i]=null;
        }
    }

    public int getN() {
        return N;
    }

    public Materias[] getvMaterias() {
        return vMaterias;
    }
    
    
    
    
    public void AgregarMateria(Materias M){
        if(diml<N)
          vMaterias[diml]=M;
            diml++;  
    }
    
    public boolean EstaGraduado(){ 
        return diml==N;
    }

    @Override
    public String toString() {
        String aux=dni+" " +nombre+"\n ";
        for (int i = 0; i < diml; i++) {
            aux+= vMaterias[i]+"\n";
        }
           if(EstaGraduado())
               aux+= "Esta graduado";
           else
               aux+="no esta graduado";
        
        return aux;
    }
    
    
    
    
}
