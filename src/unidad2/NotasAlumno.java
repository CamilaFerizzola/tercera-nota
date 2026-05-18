package unidad2;
import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double suma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota " + (i + 1) + " (0 a 10): ");
                nota = sc.nextDouble();
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
            suma += nota;
        }
        
        double media = suma / notas.length;

        double mayor = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        
        System.out.println("\nNotas del alumno:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Nota media: " + media);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);

        sc.close();
    }
}