import java.util.Scanner;

public class MuestraPares {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.println("Introduce desde que numeros quieres que empiece a imprimir pares :");
        num=sc.nextInt();
        numPares(num);
    }
    public static void  numPares(int num){
        if(num%2==0){
            for(int i=2;i<=num;i+=2){
                System.out.println(" "+i+" ");
            }
        }else{
            for (int k = 1; k <=num; k+=2) {
              System.out.println(" "+k+" ");
            }
            }
            
        }
    }
