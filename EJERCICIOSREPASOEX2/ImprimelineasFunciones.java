import java.util.Scanner;

public class ImprimelineasFunciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1=0,num2=0;
        System.out.print("¿Cuántas líneas deseas imprimir? ");
        int cantidad = sc.nextInt();
        imprimirLineas(cantidad);
        sc.close();
        System.out.println("Introduce un numero 1:");
        num1=sc.nextDouble();
        System.out.println("Introduce un numero 2:");
        num2=sc.nextDouble();
        CalcularMedia(num1, num2);
    }

    public static void imprimirLineas(int cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Línea " + i);
        }
    }
    protected static double CalcularMedia(double num1,double num2){
        return (num1+num2)/2;
    }
}
