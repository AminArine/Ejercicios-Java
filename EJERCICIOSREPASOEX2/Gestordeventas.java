/*Ejercicio 3. Gestión de ventas de una tienda
Una tienda registra las ventas diarias durante una semana.
Para cada día:
● Pedir importe vendido.
● Comprobar si la venta supera los 1000 €.
Al finalizar mostrar:
● Total vendido.
● Media diaria.
● Día con mayor venta.
● Cuántos días superaron los 1000 € */

import java.util.Scanner;
public class Gestordeventas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double venta, total = 0, mayor = 0;
        int diasSuperan1000 = 0, diaMayorVenta = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Introduce el importe vendido del día " + i + ":");
            venta = sc.nextDouble();
            total += venta;
            if (venta > 1000) {
                diasSuperan1000++;
            }
            if (venta > mayor) {
                mayor = venta;
                diaMayorVenta = i;
            }
        }
         double mediaDiaria = total / 7;
        System.out.println("Total vendido: " + total);
        System.out.println("Media diaria: " + mediaDiaria);
        
        switch(diaMayorVenta) {
            case 1:
                System.out.println("Día con mayor venta: Lunes");
                break;
            case 2:
                System.out.println("Día con mayor venta: Martes");
                break;
            case 3:
                System.out.println("Día con mayor venta: Miércoles");
                break;
            case 4:
                System.out.println("Día con mayor venta: Jueves");
                break;
            case 5:
                System.out.println("Día con mayor venta: Viernes");
                break;
            case 6:
                System.out.println("Día con mayor venta: Sábado");
                break;
            case 7:
                System.out.println("Día con mayor venta: Domingo");
                break;
        }
        System.out.println("Número de días que superaron los 1000 €: " + diasSuperan1000); 
       
    }
}