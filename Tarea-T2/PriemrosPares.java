import com.sun.tools.javac.Main;
import java.util.Scanner;
public class PriemrosPares {
    static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        num=sc.nextInt();

        if(num%2==0){
            for(int i=num;i<=100+num;i+=2) {
                System.out.println(i+" ");
            }
        }else{
            for(int i=num;i<=100+num;i+=2) {
                System.out.println((i-1)+" ");

            }
        }
    }
}
