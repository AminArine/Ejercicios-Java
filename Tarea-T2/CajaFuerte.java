import java.util.Scanner;
public class CajaFuerte {
    static void main(String[] args) {
        /*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
          El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
          mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
          ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
          */
        Scanner sc=new Scanner(System.in);
        short combinacion=0,respuesta=0;
        byte i=0;
        do {
            System.out.println("Introduce un combinacion de cuatro cifras :");
            combinacion = sc.nextShort();
            while(i<=4){
                System.out.println("Introduce la contraseña :");
                respuesta= sc.nextShort();

               if(respuesta==combinacion){
                   System.out.println("Enhorabuena su repuesta es correcta .....");
                   break;
               }else{
                   i++;
                   System.out.println("INCORRECTO .Le quedan "+(4-i)+" intentos .....");

               }

            }

        }while(combinacion < 10000);

    }
}
