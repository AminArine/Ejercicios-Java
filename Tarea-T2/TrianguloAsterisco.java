import java.util.Scanner;

public class TrianguloAsterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
        System.out.println("Introduzca un numero (de 3 a 15 ) :");
        num=sc.nextInt();

        	if(num< 3 || num>15){
        		System.out.println("                                    ");
        	}else{
        		for (int i=1;i<=num;i++ ) {
        			for (int j=1;j<=num-i;j++ ) {
        				System.out.print("*");
        			}
        			System.out.println(" ");
        		}
        	}
       
        }while(num< 3 || num>15);



        

        sc.close();
    }
}