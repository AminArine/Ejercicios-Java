
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Estrucuctura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte opcion;

        System.out.println("-----MENÚ-------"
                + "\n1. Crea un Array con 5 valores e imprime su longitud."
                + "\n2. Modifica un valor e imprime el antes y el después."
                + "\n3. Crea un ArrayList vacío."
                + "\n4. Añade 4 valores al ArrayList y elimina uno."
                + "\n5. Crea un HashSet con 2 valores diferentes."
                + "\n6. Añade un valor repetido y otro nuevo al HashSet."
                + "\n7. Elimina un elemento del HashSet."
                + "\n8. Crea un HashMap con tres contactos."
                + "\n9. Modifica un contacto y elimina otro."
                + "\n10. Convierte un Array en ArrayList, HashSet y HashMap."
        );

        System.out.println("Introduce una opción: ");
        opcion = sc.nextByte();

        switch (opcion) {

            case 1:
                int[] num = new int[5];

                for (int i = 0; i < num.length; i++) {
                    num[i] = (int) (Math.random() * 10);
                    System.out.print(num[i] + " ");
                }

                System.out.println("\nSu longitud es " + num.length);
                break;

            case 2:
                int[] numero = {5, 8, 3, 7, 9};

                

                System.out.println("Valor anterior: " + numero[numero.length]);

                numero[2] = 2;

                System.out.println("Valor nuevo: " + numero[numero.length]);
                break;

            case 3:
                var caja = new ArrayList<Integer>();

                System.out.println("Tamaño del ArrayList: " + caja.size());
                break;

            case 4:
                var lista1 = new ArrayList<Integer>();

                lista1.add(7);
                lista1.add(8);
                lista1.add(5);
                lista1.add(6);

                lista1.remove(3);

                for (int i = 0; i < lista1.size(); i++) {
                    System.out.println(lista1.get(i));
                }
                break;

            case 5:
                var set5 = new HashSet<Integer>();

                set5.add(2);
                set5.add(8);

                System.out.println(set5);
                break;

            case 6:
                var set6 = new HashSet<Integer>();

                set6.add(2);
                set6.add(8);
                set6.add(2); // Repetido
                set6.add(5); // Nuevo

                System.out.println(set6);
                break;

            case 7:
                var set7 = new HashSet<Integer>();

                set7.add(2);
                set7.add(8);
                set7.add(5);

                set7.remove(2);

                System.out.println(set7);
                break;

            case 8:
                HashMap<String, String> map = new HashMap<>();

                map.put("Moha", "672546822");
                map.put("Mama", "682532475");
                map.put("Papa", "639546213");

                System.out.println(map);
                break;

            case 9:
                HashMap<String, String> contactos = new HashMap<>();

                contactos.put("Moha", "672546822");
                contactos.put("Mama", "682532475");
                contactos.put("Papa", "639546213");

                contactos.replace("Moha", "521436251");
                contactos.remove("Mama");

                System.out.println(contactos);
                break;

            case 10:
                int[] numeros = {5, 12, 8, 20, 3};

                ArrayList<Integer> liston = new ArrayList<>();
                HashSet<Integer> seton = new HashSet<>();
                HashMap<Integer, Integer> maps = new HashMap<>();

                for (int i = 0; i < numeros.length; i++) {
                    liston.add(numeros[i]);
                }

                for (int i = 0; i < liston.size(); i++) {
                    seton.add(liston.get(i));
                    maps.put(liston.get(i), liston.get(i));
                }

                

                System.out.println("ArrayList: " + liston);
                System.out.println("HashSet: " + seton);
                System.out.println("HashMap: " + maps);
                break;

            default:
                System.err.println("Opción incorrecta.");
        }

        sc.close();
    }
}
