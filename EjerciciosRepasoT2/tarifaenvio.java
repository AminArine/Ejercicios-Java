import java.util.Scanner;
public class tarifaenvio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=======Tarifa de envio======="
            +"\n\t Zona Local 1: 5€"
            +"\n\t Zona Nacional 2: 10€"
            +"\n\t Zona Internacional Cercano3: 20€"
            +"\n\t Zona Internacional Lejano 4: 35€"
        );
        Byte zona;
        double peso,precio=0;
        System.out.println("Ingrese la zona de envio (1-4): ");
            zona=sc.nextByte();
        System.out.println("Dime el peso del paquete en kg: ");
            peso=sc.nextDouble();
            
        switch(zona) {
            case 1:
                precio+=5;
                break;
            case 2:
                precio+=10;
                break;
            case 3:
                precio+=20;
                break;
            case 4:
                precio+=35;
                break;
            default:
                System.out.println("Zona no valida");
        }
        if(peso>15){
               precio+=12; 
            }
        System.out.println("El costo total de envio es: " + precio + "€");

    }
}