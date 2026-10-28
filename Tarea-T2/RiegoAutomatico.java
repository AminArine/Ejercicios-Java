import java.util.Scanner;

public class RiegoAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion,ciclos=1,i=1;
		final float PORCENTAJE=60f;
		final byte MAXCICLOS=5;
        float temperatura=0F ,humedad=0f;
        String lluvia;
		boolean riego=false;

		do{
			System.out.println("-------M E N Ú--------"
			+"\n Riego"
			+"\n Salir");
			System.out.print("Introduce una opcion :");
			opcion=sc.nextByte();


				switch(opcion){
				case 1:

					System.out.println("Introduce lo siguiente-->");
					System.out.println("\tLa temperatura ambiente :");
					temperatura=sc.nextFloat();
					System.out.println("\tLa humedad del suelo(0-100%):");
					humedad=sc.nextFloat();
					System.out.println("\tSi hay previsión de lluvia (s/n)");
					sc.nextLine();
					lluvia=sc.nextLine();

					System.out.println("                                              ");
					System.out.println("                                              ");
					while(ciclos<=MAXCICLOS && humedad<PORCENTAJE){

						System.out.println("Ciclo numero: " + ciclos);
						System.out.println("Humedad actual: " + humedad);
						/*Si la humedad es menor de 30%, se activa el riego.
						Si la temperatura es mayor de 28 °C y no hay lluvia, también se activa el riego.
						Si se activa el riego, la humedad aumenta en 10 puntos.
						*/
						if (humedad < 30 || (temperatura > 28 && lluvia.equals("n"))) {

							riego = true;
							System.out.println("Activo el riego.....");

							humedad += 10;

							System.out.println("Humedad despues del riego: " + humedad);

						} else {
							riego = false;
							System.out.println("No activo aun el riego");
						}
						ciclos++;
					}
					break;
				case 2:
					System.out.println("Saliendo ..........");
					System.out.println(true&&true);
					System.out.println(false&&true);
					System.out.println(true&false);
					System.out.println(false&&false);
					break;
				default:
					System.out.println("OPCION INCORRECTA............");
				}

			}while(opcion!=2);



        sc.close();
    }
}