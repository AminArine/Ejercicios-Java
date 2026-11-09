import java.util.Scanner;
public class cajeroauto {
    public  static void main(String [] args){
        byte opcion=0;
        int dinero=0 ,dineroRetirar=0;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("======Bienvenido al cajero automatico======"
                +"\n\t 1. Ingresar dinero"
                +"\n\t 2. Retirar dinero"
                +"\n\t 3. Consultar saldo"
                +"\n\t 4. Salir"
            );
            
            System.out.println("Ingrese la opcion deseada: ");
            opcion=sc.nextByte();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese la cantidad de dinero a ingresar: ");
                    dinero=sc.nextInt();
                    if(dinero%50==0){
                        System.out.println("Dinero ingresado correctamente");
                    } else {
                        System.out.println("Cantidad no valida. Solo se aceptan billetes de 50€");
                    }
                    
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero a retirar: ");
                        dineroRetirar=sc.nextInt();
                    if(dineroRetirar>=dinero){
                        if(dineroRetirar%50==0){
                            for(int i=dineroRetirar;i>0;i-=50){
                                System.out.println("Dinero retirado : -"+i);
                            }
                            System.out.println("Dinero retirado correctamente");
                        }
                    
                    } else {
                        System.out.println("No tiene suficiente saldo");
                    }
                    break;
                case 3:
                    System.out.println("Su saldo actual es: "+dinero+"€");
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automatico");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while(opcion<4);
    }
}
