import java.util.Scanner;

public class ClasificaciónDeCarácter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char carac;
        String line;
        /*
        Dígito numérico ('0' a '9')
        • Letra mayúscula ('A' a 'Z')
        • Letra minúscula ('a' a 'z')
        • Otro carácter
                 */
        System.out.println("Introduce un caracter");
         carac=sc.next().charAt(0);
        if(carac>-1 && carac<=9){
            System.out.println("Dígito numérico ('0' a '9')");
        }


        sc.close();
    }
}