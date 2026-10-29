import java.util.Scanner;

public class EjerciciosFunciones {
    static void main(String[] args) {
        System.out.println("-----Menú-----"
        +"\t\n 1. Crea una función que imprima ¡Te doy la bienvenida al curso de Java desde cero! "

        +"\t\n 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona."

        +"\t\n 3. Haz un método que reciba dos números enteros y devuelva su resta."

        +"\t\n 4. Crea un método que calcule el cuadrado de un número (n * n)."

        +"\t\n 5. Escribe una función que reciba un número y diga si es par o impar."

        +"\t\n 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario)."

        +"\t\n 7. Implementa una función que reciba una cadena y retorne su longitud."

        +"\t\n 8. Crea un método que reciba un array de enteros, calcula su media y lo retorna."

        +"\t\n 9. Escribe un método que reciba un número y retorna su factorial."

        +"\t\n 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento."
        );
        int opcion,numero,numero1 ,num1,num2 ;
        byte edad;
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce la opcion elegida ....");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                saludar();
                break;
            case 2:
                saludar("Moha");
                break;
            case 3:
                System.out.println("Introduce un numero ");
                numero=sc.nextInt();
                cuadrado(numero );
                break;
            case 4:
                System.out.println("Introduce un numero ");
                numero1=sc.nextInt();
                parimpar(numero1);
                break;
            case 5:
                System.out.println("Introduce tu edad :");
                edad=sc.nextByte();
                boolean aprovacion=false;
                mayoriadeedad(edad,aprovacion);
                break;
            case 6:
                System.out.println("Introduce el primer entero ..");
                num1=sc.nextInt();
                System.out.println("Introduce el segundo entero ..");
                num2=sc.nextInt();
                resta(num1,num2);
                break;
            case 7:
                System.out.println("Introduce una cadena de texto ...");
                String cadena=sc.nextLine();
                break;
            case 8:
                System.out.println("Introduce el tamaño del array ....");
                int tamano=sc.nextInt();
                relleno(array);
                mediaarray(tamano,array);
                break;
            case 9:
                break;
            case 10:
                break;

        }
    }
    public static void saludar(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }
    public static void saludar(String name){
        System.out.println("¡"+name+" Te doy la bienvenida al curso de Java desde cero!");
    }
    public static int cuadrado(int numero){
        return (int) Math.pow(numero,2);
    }
    protected static String parimpar(int num){
        if(num%2==0){
            return "Par";
        }else{
            return "Impar";
        }
    }
    public  static boolean mayoriadeedad(byte edad ,boolean aprovacion ){
        if(edad<18){
            return false;
        }else{
            return true;
        }
    }
    public static int resta(int num1,int num2){
        return num1-num2;
    }
    public static int contador(String cadena ){
        return cadena.length();
    }
    public static int mediaarray(int [] array,int tamano){
        int sumatorio=0,media=0 ;
        for(int j;j< array.length;j++){
            sumatorio+=array[j];
        }
        return media;

    }
    public 


}
