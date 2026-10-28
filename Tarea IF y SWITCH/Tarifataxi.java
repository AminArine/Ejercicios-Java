import java.util.Scanner;

public class Tarifataxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km=0,menoscien=0,mascien=0;
        final int BASE=18;
        System.out.print("Introduce el numero de kilometros has hecho :");
        	km=sc.nextDouble();
        if(km<30){
        	System.out.print("La cantidad a abonar es la siguiente :" +BASE +" $");
        }else if (km<100){
        	menoscien=BASE+0.85*(km-30);
        	System.out.print("La cantidad a abonar es la siguiente :" + menoscien +" $");
        }else if (km>=100){
        	mascien=BASE+0.65*(km-100)+0.85*70;
        	System.out.print("La cantidad a abonar es la siguiente :" + mascien +" $");
        }
        sc.close();
    }
}