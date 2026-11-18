import java.util.Scanner;

public class Esfera {

    public static void calcularEsfera(double radio) {
        double superficie = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 * Math.PI / 3.0) * Math.pow(radio, 3);

        System.out.printf("Para una esfera con radio ", radio);
        System.out.printf("- Superficie: ", superficie);
        System.out.printf("- Volumen: ", volumen);
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();

        calcularEsfera(radio);

        scanner.close();
    }
}
