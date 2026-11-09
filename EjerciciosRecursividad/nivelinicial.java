/*1	Mostrar los números del 1 al N	N = 5 → 1 2 3 4 5
2	Mostrar los números de N a 1	N = 5 → 5 4 3 2 1
3	Sumar los números de 1 hasta N	N = 5 → 15
4	Calcular el factorial de un número	5! = 120
5	Calcular la potencia de un número	2⁴ = 16
6	Contar cuántos dígitos tiene un número	12345 → 5
7	Sumar los dígitos de un número	1234 → 10
8	Mostrar una cadena de texto al revés */
import java.util.Scanner;
public class nivelinicial{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        byte opcion;
        int num;
        do{
            System.out.println("========MENÚ========="
                +"\n\t 1	Mostrar los números del 1 al N	N = 5 → 1 2 3 4 5"
                +"\n\t 2	Mostrar los números de N a 1	N = 5 → 5 4 3 2 1"
                +"\n\t 3	Sumar los números de 1 hasta N	N = 5 → 15"
                +"\n\t 4	Calcular el factorial de un número	5! = 120"
                +"\n\t 5	Calcular la potencia de un número	2⁴ = 16"
                +"\n\t 6	Contar cuántos dígitos tiene un número	12345 → 5"
                +"\n\t 7	Sumar los dígitos de un número	1234 → 10"
                +"\n\t 8	Mostrar una cadena de texto al revés"
            );
            System.out.println("Introduce una opcion ....");
            opcion=sc.nextByte();
            switch(opcion){
                case 1:
                    System.out.println("Introduce el valor hasta el que quieres llegar ...");
                    num=sc.nextInt();
                    contador(num);
                    break;
                case 2:
                    System.out.println("Introduce el valor hasta el que quieres llegar ...");
                    num=sc.nextInt();
                    contadorinverso(num);
                    break;
                case 3:
                    System.out.println("Introduce el valor hasta el que quieres llegar ...");
                    num=sc.nextInt();
                    sumador(num);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8 :
                    break;
            }
        }while(opcion!=8);
}
    public static void  contador(int num){
        
       return contador;
    }
    public static int contadorinverso(int num){
        for(int i=num;i>=1;i--){
            return i;
        }
    }
    public static int  sumador(int num){
        int sumador=0;
        for(int i=0;i<=num;i++){
            sumador+=i;
        }
        return sumador;
    }
     public static int  factorial(int num){
       if(num==0 || num==1){
              return 1;
       }
       return num * factorial(num - 1);
     }
}