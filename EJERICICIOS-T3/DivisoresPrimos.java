import java.util.Scanner;

public class DivisoresPrimos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limite=0;
        System.out.println("Introduce el valor de num:");
        limite=sc.nextInt();
        imprimirPrimosHasta(limite);

        

        }
       public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
        }
        public static void imprimirPrimosHasta(int limite) {
        System.out.println("Números primos hasta el " + limite + ":");
        
        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    
}
