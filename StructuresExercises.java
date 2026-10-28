package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class StructuresExercises {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion ,tamano ,tam;
        int [] caja;
        int [] cajon ;
        System.out.println("----- MENÚ -----"
        +"\t\n 1. Crea un Array con 5 valores e imprime su longitud."
        +"\t\n 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo."
        +"\t\n 3. Crea un ArrayList vacío."
        +"\t\n 4. Añade 4 valores al ArrayList y elimina uno a continuación."
        +"\t\n 5. Crea un HashSet con 2 valores diferentes."
        +"\t\n 6. Añade un nuevo valor repetido y otro sin repetir al HashSet."
        +"\t\n 7. Elimina uno de los elementos del HashSet."
        +"\t\n 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos."
        +"\t\n 9. Modifica uno de los contactos y elimina otro."
        +"\t\n 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales."
        );
         System.out.println("INTRODUCE UNA OPCIÓN :");
         opcion=sc.nextInt();
         switch(opcion){
             case 1:
                 System.out.println("Introduce el tamaño del array .....");
                 tamano=sc.nextInt();
                 caja= new int [tamano];
                 for(int i=0;i<tamano;i++) {
                     caja [i] = (int) (Math.random() * 10);
                     System.out.print("-"+caja[i]);
                 }
                  System.out.println("El tamaño del array es de ...."+caja.length);

                 break;
             case 2:
                 System.out.println("Introduce el tamaño del array .....");
                 tam=sc.nextInt();
                 cajon= new int [tam];
                 for(int i=0;i<cajon.length;i++) {
                     cajon [i] = (int) (Math.random() * 10);
                 }
                 System.out.println("Valor antes de cambiar (cajon [i])");
                 System.out.println(cajon [2]);
                 cajon [2]=8;
                 System.out.println("Valor despues de pegarle un cambio :"+cajon [2]);
                 break;
             case 3:
                 var  lista =new ArrayList<Integer>();
                  System.out.println("El tamaño de esta lista es de ..."+lista.size());
                 break;
             case 4:
                 var  lista1 =new ArrayList<Integer>();
                 lista1.add(7);
                 lista1.add(8);
                 lista1.add(5);
                 lista1.add(6);
                 lista1.remove(3);
                 for(int i=0;i<lista1.size();i++) {
                     System.out.println(lista1.get(i));
                 }

                 break;
             case 5:case 6:
                 var set = new HashSet<Integer>();
                 set.add(2);
                 set.add(8);
                 break;
             case 7:
                 break;
             case 8:
                 break;
             case 9:
                 break;
             case 10 :
                 break;
         }

    }
}
