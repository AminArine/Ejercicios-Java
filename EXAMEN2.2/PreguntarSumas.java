import java.util.Scanner;

public class PreguntarSumas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Inicializamos variables del programa
        int num1=0,num2=0,resultado=0,aciertos=0,errores=0, M=10,N=0;
    //Le pido al usuario el limite de iteraciones para el bucle for.
        System.out.print("Introduce el numero de sumas que quieres hacer :");
        byte sumas=sc.nextByte();
     

        for(int i=0;i<sumas;i++){

        	num1= (int)(Math.random()*(M-N+1)+N);
        	num2= (int)(Math.random()*(M-N+1)+N);

        	System.out.println("Introduce el resultado de la suma de los siguientes numeros "+num1+" + " +num2+" = ....");
        	resultado=sc.nextShort();
    //Contadores de aciertos y errores     	
        	if(resultado==(num1+num2)){
        		System.out.println("¡ Correcto !");
        		aciertos++;
        	}else{
        		System.out.println("¡ Incorrecto !"+" La respuesta era :"+(num1+num2));
        		errores++;
        	}
        }
    //Imprimios resultados por pantalla
        System.out.println("Numero de aciertos : "+aciertos);
        System.out.println("Numero de no  aciertos :"+errores);
        



        sc.close();
    }
}