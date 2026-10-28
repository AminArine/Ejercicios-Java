import java.util.Scanner;

public class Operacioneshasta0 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,contador=0,positivo=0,negativo=0,sumaposi=0,sumanega=0;
        double media=0;
        final byte SIGNO=2;
        System.out.println("Introduce valores enteros ,el programa termina se la entrada es 0 :");
        num=sc.nextInt();
            while(num !=0){
            num=sc.nextInt();
            contador++;
            if(num>0){
                sumaposi+=num;
                positivo++;
            }else{
                sumanega+=num;
                negativo ++;
            }
            }
        media=(sumanega+sumaposi)/SIGNO;
        System.out.println("Hay "+positivo+" numeros positivos .");
        System.out.println("Hay "+negativo+" numeros negativos .");
        System.out.println("hay "+(positivo+negativo)+"numeros leidos .");
        System.out.println("La suma de positivos : "+sumaposi);
        System.out.println("La suma de los negativos : "+sumanega);
        System.out.println("La media de los valores es " + media );


    }
}
