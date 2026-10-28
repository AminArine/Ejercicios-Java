import java.util.Scanner;
    public class Amigos{
        static void main(String [] args) {
            Scanner sc =new Scanner(System.in);
            short num1,num2;
            int sum1=0,sum2=0,i=0,j=0;
            System.out.println("Introduce el primer numero :");
            num1=sc.nextShort();
            System.out.println("Introduce el segundo numero :");
            num2=sc.nextShort();
            for( i=1;i<num1;i++){
                if(num1%i==0) {
                    sum1 += i;
                }
            }
            for( j=1;j<num2;j++){
                if(num2%j==0) {
                    sum2 += j;
                }
            }

            if(sum1==num2 && sum2==num1){
                System.out.println("Son Amigos ...");
            }else{
                System.out.println("No son Amigos ...");
            }

        }
    }

