import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num,opcion;

         System.out.println("------MENU------"
     	+"\n 1) Cuadro Asteriscos"
     	+"\n 2) Triangulo Asteriscos"
     	+"\n 3) Salir "
     );
         do{
     	System.out.println("Introduzca una opcion  :");
	    opcion=sc.nextInt();
    	switch(opcion){
	        case 1:
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

	        	break;
	    	case 2:
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

	        	break;
	        case 3:
	        	System.out.println("Saliendo del programa ");
	        	break;
	    	default:
	    	System.out.println(" Opcion inexistente ...");
	    }

    	}while(opcion<1 || opcion >3);
	

        sc.close();
    }
}