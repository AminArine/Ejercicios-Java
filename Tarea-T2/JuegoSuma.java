import java.util.Scanner;

public class JuegoSuma {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,aleatorio,aleatorio1,max,min;
        max=99;
        min=1;
        aleatorio = (int) (Math.random() * (max - min + 1)) + min;
        aleatorio1 = (int) (Math.random() * (max - min + 1)) + min;

        System.out.println("Suma estos numeros : "+aleatorio+" -- "+aleatorio1+" : ");
        num=sc.nextInt();
        do {
            if (num == 0) {
                System.out.println("SALIENDO DEL PROGRAMA ...");
            } else {
                if (aleatorio + aleatorio1 == num) {
                    System.out.println("Enhorabuena usted ha acertado");
                } else {
                    System.out.println(" Usted no  acertado ");
                }
            }
        }while(num !=0);

        sc.close();


    }
}
