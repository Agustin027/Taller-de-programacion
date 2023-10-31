
package parcialtetro;

public class ParcialTetro {


    public static void main(String[] args) {
        Funcion Fteatro=new Funcion("El fantasma de la opera", "10/10/2023", "20:00", 4, 4);
        
        Fteatro.OcuparButaca(0, 0);
        Fteatro.OcuparButaca(0, 1);
         Fteatro.OcuparButaca(0, 2);
          Fteatro.OcuparButaca(0, 3);
           Fteatro.OcuparButaca(1, 0);
           Fteatro.OcuparButaca(1, 1);
        
           System.out.println(Fteatro.toString());
           System.out.println(Fteatro.RepresentacionButacas(0));
           Fteatro.DesocuparButacas(0);
           System.out.println(Fteatro.toString());
           
    }
    
}
