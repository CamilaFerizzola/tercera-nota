package unidad1;
import java.util.Scanner;

public class Operario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = sc.nextDouble();

        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = sc.nextInt();

        if (sueldo < 500 && antiguedad >= 10) {
            double aumento = sueldo * 0.20;
            double sueldoFinal = sueldo + aumento;
            System.out.println("Sueldo a pagar: " + sueldoFinal);
        } else if (sueldo < 500) {
            double aumento = sueldo * 0.05;
            double sueldoFinal = sueldo + aumento;
            System.out.println("Sueldo a pagar: " + sueldoFinal);
        } else {
            System.out.println("Sueldo a pagar: " + sueldo);
        }

        sc.close();
    }
}