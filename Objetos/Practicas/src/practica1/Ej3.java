package practica1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej3 {
    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar(); 
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
            int [] [] tabla  = new int [5][5];

            for (int i=0;i<5;i++)
                for (int j=0;j<5;j++)
                    tabla[i][j]=GeneradorAleatorio.generarInt(10);

        //Paso 4. mostrar el contenido de la matriz en consola
           for (int i=0;i<5;i++)
                    for (int j=0;j<5;j++)
                        System.out.println("La Pos. " + i + ","  +  j  + " tiene"  +tabla[i][j]);
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
            int cant = 0;
            for (int j=0; j<5; j++)
                cant= tabla[0][j]+cant;
            System.out.println(cant);
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
             int [] vec = new int [5]; 
              for (int j=0; j <5; j++)
                     for (int i=0; i <5; i++)
                      vec[j]=vec[j]+tabla[i][j];
                   
               for (int j=0; j <5; j++)
                   System.out.println(vec[j]);
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
            System.out.println("ingresar entero");
           int num = Lector.leerInt();

           boolean ok=false;
            int i = 0;
            int j;
            int fila =0,columna=0;
           while(ok==false && i<5){
               j=0;
               while(ok==false && j<5){
                   if (num==tabla[i][j]){
                       ok=true;
                       fila=i;
                       columna=j;
                         }
                   j++;
               }
               i++;
           }

           if (ok)
               System.out.println("se encontro el elemento en la Pos: "+fila+"," +columna);
           else
               System.out.println("no se encontro el elemento");
    }
    
}
