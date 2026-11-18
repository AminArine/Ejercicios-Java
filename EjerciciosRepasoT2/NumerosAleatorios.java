import java.util.Scanner;

public class NumerosAleatorios {

    public static void mostrarAleatorios(int cantidad, int min, int max) {
        System.out.println("Generando " + cantidad + " números enteros entre " + min + " y " + max + ":");
        
        for (int i = 0; i < cantidad; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.print(aleatorio + " ");
        }
        System.out.println();
    }

    public static void mostrarAleatorios(int cantidad) {
        System.out.println("Generando " + cantidad + " números reales entre 0 y 1:");
        
        for (int i = 0; i < cantidad; i++) {
            double aleatorio = Math.random();
            System.out.print(aleatorio + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad: ");
        int cantidad = scanner.nextInt();
        mostrarAleatorios(cantidad);
        scanner.close();
    }
}
