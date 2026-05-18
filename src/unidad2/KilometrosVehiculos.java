package unidad2;
import java.util.Scanner;

public class KilometrosVehiculos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de vehículos: ");
        int n = sc.nextInt();
        
        int[] kilometros = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese los kilómetros recorridos por el vehículo " + (i + 1) + ": ");
            kilometros[i] = sc.nextInt();
        }
        
        int contadorRango1 = 0; 
        int contadorRango2 = 0; 
        int totalKilometros = 0; 
        
        for (int i = 0; i < n; i++) {
            
            totalKilometros += kilometros[i];
            
            if (kilometros[i] >= 10 && kilometros[i] <= 300) {
                contadorRango1++;
            } 
            else if (kilometros[i] > 300) {
                contadorRango2++;
            }
        }

        System.out.println("Vehículos que recorrieron entre 10 km y 300 km: " + contadorRango1);
        System.out.println("Vehículos que recorrieron más de 300 km: " + contadorRango2);
        System.out.println("Total de kilómetros recorridos por la flota: " + totalKilometros + " km");

        sc.close();
    }
}