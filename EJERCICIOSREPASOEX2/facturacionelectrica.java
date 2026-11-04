import java.util.Scanner;

public class facturacionelectrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilovatios,consumo,recargo=0;
        final byte CUOTA=10;
        
        do{
        System.out.println("Introduce el número de kilovatios consumidos: ");
        consumo = sc.nextDouble();
        kilovatios = consumo;
            if (kilovatios <=100) {
                kilovatios *=0.10;
            }else if(kilovatios>100 &&  kilovatios<=200){
                kilovatios *=0.15;
            }else if(kilovatios>200){
                kilovatios *=0.18;
                if(kilovatios>250){
                    recargo = 5;
                    kilovatios+=recargo;
                }
            }
        kilovatios += CUOTA;
        System.out.println("El consumo es  " + consumo + " €");
        System.out.println("El coste del consumo es  " + kilovatios + " €");
        System.out.println("La cuota fija es  " + CUOTA + " €");
        System.out.println("El recargo es  " + recargo + " €");
        System.out.println("El IVA es  " + (kilovatios*0.21) + " €");
        System.out.println("El total es  " + (kilovatios*1.21) + " €");
        System.out.println("Introduce el consumo del siguiente cliente: ");
    }while(kilovatios > 0);


    /*Consumo: 150 kWh
Coste del consumo: 22.50 €
Cuota fija: 10.00 €
Recargo: 0.00 €
IVA: 6.83 €
TOTAL: 39.33 €
Introduce el consumo del siguiente cliente: */
}}