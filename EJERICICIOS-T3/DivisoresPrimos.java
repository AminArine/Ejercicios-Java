import java.util.Scanner;

public class DivisoresPrimos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.println("Introduce el valor de num:");
        num=sc.nextInt();
        for(int i=2;i<=num;i++){
            for(int j=1;j<num;j++){
            if((i%j==0)&&(i%i==0)){
                System.out.println(" "+i+" ");
                }
            }
        }    
        }
    
}
