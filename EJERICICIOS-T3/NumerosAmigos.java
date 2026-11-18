import java.util.Scanner;

public class NumerosAmigos {

    public static int sumarDivisoresPropios(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean sonAmigos(int a, int b) {
        return (sumarDivisoresPropios(a) == b) && (sumarDivisoresPropios(b) == a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        if (sonAmigos(num1, num2)) {
            System.out.println("¡Los números " + num1 + " y " + num2 + " son amigos!");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son amigos.");
        }

        scanner.close();
    }
}
