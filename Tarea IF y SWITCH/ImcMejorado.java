import java.util.Scanner;

public class ImcMejorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura=0,peso=0,imc=0;
		System.out.print("Introduce tu altura en cm: ");
		altura=sc.nextInt();
		System.out.print("Introduce tu peso en cm  : ");
		peso=sc.nextInt();
		imc=peso/(altura*altura);
		System.out.println("Su IMC es de : "+imc);
		if(imc<18.5){
			System.out.print("PESO INSUFICIENTE");
		}else if(imc<24.9){
			System.out.print("NORMOPESO");
		}else if(imc<29.9){
			System.out.print("SOBREPESO");
		}else if(imc<34.9){
			System.out.print("OBESIDAD");
		}else if (imc<35){
			System.out.print("OBESIDAD MÓRBIDA");
		}
        

        sc.close();
    }
}