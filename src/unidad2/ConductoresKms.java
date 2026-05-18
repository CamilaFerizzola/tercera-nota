package unidad2;
import java.util.Scanner;

public class ConductoresKms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese la cantidad de conductores: ");
        int n = sc.nextInt();

        sc.nextLine(); 
        
        String[] nombre = new String[n];
        int[][] kms = new int[n][7];
        int[] total_kms = new int[n];
        
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese el nombre del conductor " + (i + 1) + ": ");
            nombre[i] = sc.nextLine();

            for (int j = 0; j < 7; j++) {
                System.out.print("Ingrese kilómetros del día " + (j + 1) + ": ");
                kms[i][j] = sc.nextInt();
            }

            sc.nextLine();
        }
        
        for (int i = 0; i < n; i++) {
            int suma = 0;

            for (int j = 0; j < 7; j++) {
                suma += kms[i][j];
            }

            total_kms[i] = suma;
        }
        
        System.out.println("\n=== TOTAL DE KILÓMETROS POR CONDUCTOR ===");

        for (int i = 0; i < n; i++) {
            System.out.println("Conductor: " + nombre[i] + " → Total km: " + total_kms[i]);
        }

        sc.close();
    }
}