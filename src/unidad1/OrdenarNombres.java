package unidad1;
import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = sc.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = sc.nextLine();

        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println("Nombres ordenados:");
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else {
            System.out.println("Nombres ordenados:");
            System.out.println(nombre2);
            System.out.println(nombre1);
        }

        sc.close();
    }
}