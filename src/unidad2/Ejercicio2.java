package unidad2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numEmpleados;
        int sueldo = 0;
        int empleados300 = 0;
        int empleadosMas300 = 0;
        double gastoTotal = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        numEmpleados = scanner.nextInt();
        
        gastoTotal += sueldo;

        for (int i = 1; i <= numEmpleados; i++) {

            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            sueldo = scanner.nextInt();

            if (sueldo >= 100 && sueldo <= 300) {
                empleados300++;
            } else {
                empleadosMas300++;
            }
        }
        System.out.println("\nEmpleados que cobran entre 100 y 300 dólares: " + empleados300);
        System.out.println("Empleados que cobran más de 300 dólares: " + empleadosMas300);
        System.out.println("Gasto total en sueldos: $" + gastoTotal);

        scanner.close();
    }
}

