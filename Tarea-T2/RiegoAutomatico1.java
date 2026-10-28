import java.util.Scanner;

public class RiegoAutomatico1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte opcion, ciclos = 0, i = 0;
        final float PORCENTAJE = 60f;
        final byte MAXCICLOS = 5;

        float temperatura = 0f, humedad = 0f;
        String lluvia;
        boolean riego = false;

        do {
            System.out.println("------- M E N Ú --------"
                    + "\n1. Riego"
                    + "\n2. Salir");

            System.out.print("Introduce una opcion: ");
            opcion = sc.nextByte();

            switch (opcion) {
                case 1:
                    ciclos = 0;
                    i = 0;

                    System.out.println("Introduce lo siguiente-->");

                    System.out.println("\tLa temperatura ambiente:");
                    temperatura = sc.nextFloat();

                    System.out.println("\tLa humedad del suelo (0-100%):");
                    humedad = sc.nextFloat();

                    System.out.println("\t¿Hay previsión de lluvia? (s/n)");
                    sc.nextLine();
                    lluvia = sc.nextLine();

                    while (ciclos < MAXCICLOS && humedad < PORCENTAJE) {
                        ciclos++;
                        i++;

                        if (humedad < 30 || (temperatura > 28 && lluvia.equalsIgnoreCase("n"))) {
                            riego = true;
                        } else {
                            riego = false;
                        }

                        System.out.println("\nCiclo número: " + i);
                        System.out.println("\tHumedad actual: " + humedad + "%");

                        if (riego) {
                            System.out.println(
                                    "\tEstado del riego: ACTIVADO");

                            humedad += 10;

                            System.out.println(
                                    "\tHumedad después del riego: "
                                    + humedad + "%");
                        } else {
                            System.out.println(
                                    "\tEstado del riego: DESACTIVADO");
                        }
                    }

                    System.out.println("\nFin de la simulación.");

                    if (humedad >= PORCENTAJE) {
                        System.out.println(
                                "Se ha alcanzado el 60% de humedad.");
                    } else {
                        System.out.println(
                                "Se ha alcanzado el máximo de 5 ciclos.");
                    }

                    break;

                case 2:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println(
                            "OPCION INCORRECTA");
            }

        } while (opcion != 2);

        sc.close();
    }
}
        


    
