import java.util.Scanner;

public class DistanciaEuclidea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y1 = 0, y2 = 0, x1 = 0, x2 = 0;

        System.out.println("Introduce el numero y1");
        y1 = sc.nextDouble();

        System.out.println("Introduce el numero y2");
        y2 = sc.nextDouble();

        System.out.println("Introduce el numero x1");
        x1 = sc.nextDouble();

        System.out.println("Introduce el numero x2");
        x2 = sc.nextDouble();
        System.out.println("La distanci es de  ...."+distancia(x1,x2,y1,y2)+" m ");
        

      
    }

    protected static double distancia(double x1,double x2,double y1,double y2) {
        double distancia=0;
        distancia=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2));
        return distancia;
    }
}
