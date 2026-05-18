package unidad2;
import java.util.Scanner;

public class ConsumoAgua {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de apartamentos: ");
        int n = sc.nextInt();
        
        int[] consumos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el consumo del apartamento " + (i + 1) + " (en m³): ");
            consumos[i] = sc.nextInt();
        }
        
        int contadorRango1 = 0; 
        int contadorRango2 = 0; 
        int consumoTotal = 0;   

        for (int i = 0; i < n; i++) {
            
            consumoTotal += consumos[i];
            
            if (consumos[i] >= 1 && consumos[i] <= 50) {
                contadorRango1++;
            } 
            else if (consumos[i] > 50) {
                contadorRango2++;
            }
        }

        System.out.println("Apartamentos que consumieron entre 1 y 50 m³: " + contadorRango1);
        System.out.println("Apartamentos que consumieron más de 50 m³: " + contadorRango2);
        System.out.println("Consumo total de la unidad residencial: " + consumoTotal + " m³");

        sc.close();
    }
}
