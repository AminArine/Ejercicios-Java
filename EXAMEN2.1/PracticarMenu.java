import java.util.Scanner;

public class PracticarMenu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicalizamos todas las variable que vamosa a utilizar
        	byte opcion=0;
        	float nota=0f,media=0f,sumnotas=0F;
        	char teclado='a';
        	short contador=0;
        // Creo un menú
        	do{
        	System.out.println("============================="
            +"\n\t      MENÚ       "
        	+"\n============================="
        	+"\n 1.Programador"
        	+"\n 2.Calcular notas"
            +"\n 3.Salir");	
        	
        // El usuario ntroduce una opcion del menú
          	System.out.println("Introduce una opcion del menu : ");
          	opcion=sc.nextByte();
        // Con el switch doy entrada a los distintos casos 
          	switch (opcion) {
          	    case 1:
          	        System.out.print(" Programador : M.Amin Ben Assad El Arine ");
          	        break;
          	    case 2:
        //El do-while me permite que se ejecute por lo menos una vez el bucle por si hay solo una nota .
          	    	do{
          	        System.out.println("Introduce un nota :");
          	        	nota=sc.nextFloat();
          	        System.out.println("¿Quieres introducir otra nota ? (s/n)");
          	        	teclado=sc.next().charAt(0);
        //El contador=iteracones del bucle 
	          	        contador++;
	          	        sumnotas+=nota;
	          	     }while(teclado!='n'); 
	    //Calculo la media y le asigno una calificacion 
          	     	media=sumnotas/contador;
          	     	if(media<5){
          	     		System.out.println("Calificacion : SUSPENSO");
          	     	}else if(media>5 && media<6){
          	     		System.out.println("Calificacion :APROBADO");
          	     	}else if(media>6 && media<7){
          	     		System.out.println("Calificacion : BIEN");
          	     	}else if(media>7 && media<9){
          	     		System.out.println("Calificacion : NOTABLE");
          	     	}else if(media>9 && media<10){
          	     		System.out.println("Calificacion :SOBRESALIENTE");
          	     	}
          	        System.out.println("SU MEDIA ES DE  :"+media);
					sgfsdfsd

          	     	
          	        break;
          	    case 3:
          	        System.out.print("Saliendo del programa ..............");
          	        break;
          	    default:
          	        System.out.println("Opción incorrecta");
          	       
          	}
          }while(opcion!=3);
        

        sc.close();
    }
}