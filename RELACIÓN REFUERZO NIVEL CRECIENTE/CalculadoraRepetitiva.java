import java.util.Scanner;

public class  CalculadoraRepetitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion,a,b ;
        System.out.println("-------M-E-N-Ú------"
        +"\t\n 1: Suma "
        +"\t\n 2: Resta"
        +"\t\n 3: Multiplicación"
        +"\t\n 4: División "
        +"\t\n 0: salir");
        System.out.println("Introduce una ocpion :");
        opcion=sc.nextInt();

        System.out.println("Introduce a :");
        a=sc.nextInt();
        System.out.println("Introduce b :");
        b=sc.nextInt();
        switch(opcion){
            case 0:
                System.out.println("Saliendo del programa ...........");
                break;
            case 1:
                System.out.println("Resultado :"+(a+b));
                break;
            case 2 :
                System.out.println("Resultado :"+(a-b));
                break;
            case 3:
                System.out.println("Resultado :"+(a*b));
                break;
            case 4 :
                System.out.println("Resultado :"+(a/b));
                break;
            default:
                System.err.println("Errooooooooooooooooor .....");
                break;
        }




        sc.close();
    }
}