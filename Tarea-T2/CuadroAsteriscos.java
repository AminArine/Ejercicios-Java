import java.util.Scanner;

public class CuadroAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
        System.out.println("Introduzca un numero (de 1 a 30 ) :");
        num=sc.nextInt();

        	if(num< 1 || num>30){
        		System.out.println("                                    ");
        	}else{
        		for (int i=1;i<=num;i++ ) {
        			for (int j=1;j<=num;j++ ) {
        				System.out.print("*");
        			}
        			System.out.println(" ");
        		}
        	}
       
        }while(num< 1 || num>30);



        sc.close();
    }
}