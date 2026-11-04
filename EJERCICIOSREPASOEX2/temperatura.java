/*Solicita temperaturas hasta que el usuario introduzca el valor -99.
Al finalizar, mostrar:
● Temperatura máxima.
● Temperatura mínima.
● Temperatura media */

import java.util.Scanner;
public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura, maximo=30000000, minimo =-300000, suma = 0, contador = 0;
    
       do{
            System.out.println("Introduce la temperatura "+(contador+1)+"  (introduce -99 para finalizar):");
            temperatura = sc.nextInt();
            
            if (temperatura > maximo) {
                maximo = temperatura;
            }
            if (temperatura < minimo) {
                minimo = temperatura;
            }
            suma += temperatura;
            contador++;
        }while (temperatura != -99) ;
        if (contador > 0) {
            double media =  suma / contador;
            System.out.println("Temperatura máxima: " + maximo);
            System.out.println("Temperatura mínima: " + minimo);
            System.out.println("Temperatura media: " + media);
        } else {
            System.out.println("No se introdujeron temperaturas válidas.");
        }
    }
}