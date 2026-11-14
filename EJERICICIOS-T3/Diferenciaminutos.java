import java.util.Scanner;

public class Diferenciaminutos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short hora1=0,  hora2=0,minuto1=0,minuto2=0;
        do{
            do{
                System.out.println("Introduce la hora 1:");
                hora1=sc.nextShort();
                System.out.println("Introduce los minutos 1:");
                minuto1=sc.nextShort();
            }while(hora1>24 && minuto1 >60);
            do{
                System.out.println("Introduce la hora 2:");
                    hora2=sc.nextShort();
                System.out.println("Introduce los minutos 2:");
                minuto2=sc.nextShort();
                
            }while(hora2>24 && minuto2>60);
            
        }while(hora1>hora2 && minuto1>minuto2);
        System.out.println("La diferencia es de : "+diferencia(hora1, hora2, minuto1, minuto2) +" minutos.");
    }
    protected static int diferencia(short hora1,short hora2,short minuto1,short minuto2){
        int  diferencia=0;
        diferencia = (minuto2-minuto1)+((hora2-hora1)*60);
        return diferencia; 
    }
    }

