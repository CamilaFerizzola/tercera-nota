package unidad1;
import java.util.Scanner;

public class ImpuestosSueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de la persona: ");
        double sueldo = sc.nextDouble();

        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos.");
        } else {
            System.out.println("No debe abonar impuestos.");
        }

        sc.close();
    }
}