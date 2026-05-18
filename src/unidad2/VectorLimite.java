package unidad2;
import java.util.Scanner;

public class VectorLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];
        int i = 0;
        
        while (i < vector.length) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                break; 
            }

            vector[i] = numero;
            i++;
        }
        
        System.out.println("\nElementos ingresados:");
        for (int j = 0; j < i; j++) {
            System.out.println(vector[j]);
        }

        sc.close();
    }
}