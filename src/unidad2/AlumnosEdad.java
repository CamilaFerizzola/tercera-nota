package unidad2;
import java.util.Scanner;

public class AlumnosEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[100];
        int[] edades = new int[100];

        int cantidad = 0;
        
        while (true) {
            System.out.print("Ingrese nombre del alumno (* para terminar): ");
            String nombre = sc.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            nombres[cantidad] = nombre;
            edades[cantidad] = edad;
            cantidad++;
        }
        
        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < cantidad; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " - " + edades[i] + " años");
            }
        }

        int mayorEdad = edades[0];
        for (int i = 1; i < cantidad; i++) {
            if (edades[i] > mayorEdad) {
                mayorEdad = edades[i];
            }
        }
        
        System.out.println("\nAlumnos con la mayor edad:");
        for (int i = 0; i < cantidad; i++) {
            if (edades[i] == mayorEdad) {
                System.out.println(nombres[i] + " - " + edades[i] + " años");
            }
        }

        sc.close();
    }
}