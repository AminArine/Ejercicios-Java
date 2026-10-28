import java.util.Scanner;

public class SegundoGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double sol,sol1;
        System.out.print("Introduce el coeficiente de la variable de segundo grado :");
        a=sc.nextInt();
        System.out.print("Introduce el coeficiente de la variable de primer  grado :");
        b=sc.nextInt();
        System.out.print("Introduce el coeficiente sin variable :");
        c=sc.nextInt();
        
        if(a==0){
        	System.err.println("EL valor de 'a' tiene que ser positivo ");
        	System.out.println("La solucion de la ecuacion  de primer grado es :"+(-c/b));
        }
        if((Math.pow(b,2)-4*a*c)<0){
        	System.out.print(" No tiene solución en los numeros reales");
        }else{
        	sol=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        	sol1=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        		if(sol==sol1){
        			System.out.println("La solucion doble es la siguiente :"+"x:"+sol);
        		}else{
        			System.out.println("Una solucion es la siguiente :"+sol);
        			System.out.print("Otra  solucion es la siguiente :"+sol1);
        		}
        }


        sc.close();
    }
}