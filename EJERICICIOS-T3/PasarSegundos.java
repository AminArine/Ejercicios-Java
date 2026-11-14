import java.util.Scanner;

public class PasarSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas=0,minutos=0,seg=0;
        System.out.println("Introduce las horas");
        horas = scanner.nextInt();

        System.out.println("Introduce los minutos");
        minutos = scanner.nextInt();

        System.out.println("Introduce los segundos");
        seg = scanner.nextInt();

        
        System.out.println("LA CANTIDAD DE SEGUNDOS ES .."+  segundos( horas,minutos, seg) +" s");
      
	}
    protected static int segundos(int horas,int minutos,int seg ){
        return (horas*3600+minutos*60+seg);
    }
}
