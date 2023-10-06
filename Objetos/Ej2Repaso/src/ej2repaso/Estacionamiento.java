
package ej2repaso;

public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String hApertura;
    private String hCierre;
     private int piso;
     private int plaza;
     private Auto [][] mAutos;

    public Estacionamiento(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.hApertura = "8:00";
        this.hCierre = "21:00";
        this.piso = 5;
        this.plaza = 10;
        mAutos= new Auto [piso][plaza];
        for (int i = 0; i < piso; i++) 
            for (int j = 0; j < plaza; j++) 
                mAutos[i][j]=null;  
              
    }

    public Estacionamiento(String nombre, String direccion, String hApertura, String hCierre, int piso, int plaza) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.hApertura = hApertura;
        this.hCierre = hCierre;
        this.piso = piso;
        this.plaza = plaza;
         mAutos= new Auto [piso][plaza];
        for (int i = 0; i < piso; i++) 
            for (int j = 0; j < plaza; j++) 
                mAutos[i][j]=null;  
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String gethApertura() {
        return hApertura;
    }

    public void sethApertura(String hApertura) {
        this.hApertura = hApertura;
    }

    public String gethCierre() {
        return hCierre;
    }

    public void sethCierre(String hCierre) {
        this.hCierre = hCierre;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public Auto[][] getmAutos() {
        return mAutos;
    }

    public void setmAutos(Auto[][] mAutos) {
        this.mAutos = mAutos;
    }
     
     
       public void registrarAuto(Auto A, int X, int Y){
        mAutos[X][Y]=A;
        
    }
    
    
   
     public String buscarPatente(String Patente){
        for (int i = 0; i < piso; i++) {
            for (int j = 0; j < plaza; j++) {
                if (mAutos[i][j] != null && mAutos[i][j].getPatente().equals(Patente)) {
                    return "La patente se encuentra en el piso " + i  + ", plaza " + j ;
                }
        }
    }
    return "La patente no se encuentra en el estacionamiento";
}

     
     
     public int cantY(int plaza){
         int cant=0;
         for (int i = 0; i < piso; i++) {
             if (mAutos[i][plaza]!=null)
                 cant++;
         }
         
         
         
         return cant;
     }
     
     
     
     
    @Override
    public String toString() {
        String aux= "";
        
        for (int i = 0; i <piso; i++) {
            aux+="Piso " + i;
            for (int j = 0; j < plaza; j++) { 
                aux+= "[Plaza " + j+" ";
                if(mAutos[i][j]==null)
                    aux+= "esta libre] " ;
                else
                     aux+=mAutos[i][j]+"   ";
            }
            aux+="\n"+("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")+"\n";


        }
        
        
        return aux;
    }
     
    
     
     
     
}
