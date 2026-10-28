import java.util.Scanner;

public class LoteDefectuoso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lote=0;
       
        System.out.print("Introduce el numero del lote :");
        lote=sc.nextDouble();
        if((lote>=5300 &&lote<=5399) || (lote>=33001 && lote <=39999)||(lote>=178000 &&lote <=191499) ) {
        	System.out.println("Lote Defectuoso");
        
	        
   		}else{
   			System.out.print("EL lote no es defectuoso ");
   		}

        sc.close();
    }
}