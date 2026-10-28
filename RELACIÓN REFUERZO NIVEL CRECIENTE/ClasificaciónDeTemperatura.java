import java.util.Scanner;

public class  ClasificaciónDeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  tecla;

            System.out.println("Introduce temperatura: ");
            tecla=sc.nextInt();

            if (tecla <= 9 ) {
                System.out.println("Es un numero  ");
            } else if (tecla <= 'Z') {
                System.out.println("Letra Mayúscula  ");
            } else if ( tecla <= 'z') {
                System.out.println("Letra Minúscula ");
            } else  {
                System.out.println("Otro carácter ");
            }


        

        sc.close();
    }
}