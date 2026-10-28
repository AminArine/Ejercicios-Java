import java.util.Scanner;

public class TablaMejorada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
       
        do{
        System.out.println("Introduzca un numero (de 1 a 10 ) :");
        num=sc.nextInt();

        	if(num< 1 || num>10){
        		System.out.println("                                    ");
        	}else{
        		System.out.println("Tabla del "+num+" :");
			    for(int i=0;i<=10;i++){
			       System.out.println(num +" x "+i+" = "+(num*i));
			    }
        	}
       
        }while(num< 1 || num>10);


        
        

        sc.close();
    }
}