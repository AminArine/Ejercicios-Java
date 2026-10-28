
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;

        do {
            System.out.println("Dime tu nota :");
            nota = sc.nextDouble();

            // Si la nota está en el rango correcto, se evalúa; si no, se muestra el error.
            if (nota >= 0 && nota <= 10) {
                if (nota < 5) {
                    System.out.println("Insuficiente");
                } else if (nota < 6) {
                    System.out.println("Suficiente");
                } else if (nota < 7) {
                    System.out.println("Bien");
                } else if (nota < 9) {
                    System.out.println("Notable");
                } else {
                    System.out.println("Excelente");
                }
            } else {
                System.err.print("TENGO UN TICKET DIRECTO A CALVALAND PARA TI ");
            }

        } while (nota != 10);
