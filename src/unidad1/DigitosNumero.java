package unidad1;
import java.util.Scanner;

public class DigitosNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = sc.nextInt();

        if (numero >= 10) {
            System.out.println("El número tiene dos dígitos.");
        } else {
            System.out.println("El número tiene un dígito.");
        }

        sc.close();
    }
}