/*===== TIENDA =====
1. Registrar una venta
2. Mostrar estadísticas
3. Finalizar jornada*/ 
import java.util.Scanner;
public class GestorTienda{
    private static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        byte unidades ,opcion, teclados=0, ratones=0, monitores=0;
        int totalVentas=0;
        final byte PRECIO_TECLADO=20;
        final byte PRECIO_RATON=12;
        final byte PRECIO_MONITOR=50;

        do{
        System.out.println("===== TIENDA ====="
            + "\n\t 1. Registrar una venta"
            + "\n\t 2. Mostrar estadísticas"
            + "\n\t 3. Finalizar jornada");
        System.out.println("Introduce una opcion del menu (1-3): ");
        opcion=sc.nextByte();
        switch(opcion){
            case 1:
                System.out.println("===== Productos====="
                + "\n\t 1. Teclado(20$)"
                + "\n\t 2. Raton(12$)"
                + "\n\t 3. Monitor(50$)");
                System.out.println("Introduce una opcion del menu (1-3): ");
                opcion=sc.nextByte();
                 System.out.println("Introduce cuantas unidades quieres : ");
                unidades=sc.nextByte();
                switch(opcion){
                case 1:
                    System.out.println("Los teclados estan en 20 $$$");
                    teclados=unidades;
                    totalVentas += unidades * PRECIO_TECLADO;
                    break;
                case 2:
                    ratones = unidades;
                    System.out.println("Los ratones estan en 12 $$$");
                    totalVentas += unidades * PRECIO_RATON;       
                    break;
                case 3:
                    monitores = unidades;
                    System.out.println("Los monitores estan en 50 $$$");
                    totalVentas += unidades * PRECIO_MONITOR;
                    break;
                default:
                System.err.println("ERRRRRRRRRRRRRORRRRRRRRRRRRRRRRRRRRRRRRRRRR");
                }
            case 2:
                System.out.println("Ha comprado" +teclados+" de teclasos por " + PRECIO_TECLADO + " $$$");
                System.out.println("ha comprado" +ratones+" de ratones por " + PRECIO_RATON + " $$$");
                System.out.println("ha comprado" +monitores+"de monitores por " + PRECIO_MONITOR + " $$$"  );
                System.out.println("Total de ventas: " + totalVentas);
            case 3:
                System.out.println("Fin de la jornada.....................");
                break;
            default:
                System.err.println("ERRRRRRRRRRRRRORRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        }
        }while(opcion!=3);
    } 
}