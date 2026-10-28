import java.util.Scanner;

public class Adivinador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aleatorio,entrada ;
        final int N=1,M;

        System.out.println("Introduce el numero máximo :");
        num=sc.nextInt();
        M=num;
        aleatorio = (int) (Math.random() * (M+ 1-N)) + N;
        do{
	        System.out.println("Tienes que adivinar  un numero entre 1 y "+M+" :");
	        entrada=sc.nextInt();

	        if(aleatorio==entrada){
	        	System.out.println("ENHORABUENA POPONARR");
			        

	        }else {
	        	if(aleatorio>entrada){
			        	System.out.println("Es mayor  que "+entrada+"  ...");
			        }else{
			        	System.out.println("Es menor  que "+entrada+"  ...");
			        }
	        }


    	}while(aleatorio!=entrada);
        sc.close();
    }
}