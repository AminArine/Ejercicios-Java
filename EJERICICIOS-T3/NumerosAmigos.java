import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.println("Introduce el valor de num:");
        num=sc.nextInt();
        for(int i=2;i<=num;i++){
            if(num%i==0){
                System.out.println(" "+(num/i)+" ");
                num=(num/i);
            }
        }
    }
}
