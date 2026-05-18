package unidad1;
import java.util.Scanner;

public class OperacionesNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
       
        if (num1 > num2) {
            double suma = num1 + num2;
            double diferencia = num1 - num2;

            System.out.println("La suma es: " + suma);
            System.out.println("La diferencia es: " + diferencia);
        } else {
            double producto = num1 * num2;

            System.out.println("El producto es: " + producto);

            if (num2 != 0) {
                double division = num1 / num2;
                System.out.println("La división es: " + division);
            } else {
                System.out.println("No se puede dividir entre cero.");
            }
        }

        sc.close();
    }
}