package parcialalumnos;


public class Alumnos {
    int dni;
    String nombre;
    int N;
    Materias [] vMaterias;
    int dimL;

    public Alumnos(int dni, String nombre, int N) {
        this.dni = dni;
        this.nombre = nombre;
        this.N = N;
        vMaterias= new Materias[N];
        for (int i = 0; i < N; i++) {
            vMaterias[i]=null;
        }
        dimL=0;
    }

   
    
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void AgregarNota(Materias M){
        if(dimL<N){
            vMaterias[dimL]=M;
            dimL++;
        }
        
    }
    
    public String EstaGraduado(){
        for (int i = 0; i < dimL; i++) {
           if(N==dimL && vMaterias[i].getNombre().equalsIgnoreCase("Tesis")) 
              return ("Esta graduado");
        }
        return ("No esta graduado");
    }

    @Override
    public String toString() {
        String aux= "dni= " + dni + ", nombre= " + nombre +"\n"+"Notas"  ;
        for (int i = 0; i < dimL; i++) {
            aux+= vMaterias[i]+"\n";
        }
        aux+="\n"+ EstaGraduado();
        return aux;
    }
    
    
    
}
