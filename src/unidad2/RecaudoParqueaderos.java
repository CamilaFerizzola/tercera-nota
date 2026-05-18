package unidad2;
import java.util.Scanner;

public class RecaudoParqueaderos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese la cantidad de vehículos que pagaron: ");
        int n = sc.nextInt();
        
        int[] pagos = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el pago del vehículo " + (i + 1) + ": $");
            pagos[i] = sc.nextInt();
        }
        
        int contadorRango1 = 0; 
        int contadorRango2 = 0; 
        int totalRecaudado = 0;  
        
        for (int i = 0; i < n; i++) {
            
            totalRecaudado += pagos[i];
            
            if (pagos[i] >= 2000 && pagos[i] <= 20000) {
                contadorRango1++;
            } 
            else if (pagos[i] > 20000) {
                contadorRango2++;
            }
        }
        System.out.println("Vehículos que pagaron entre $2.000 y $20.000: " + contadorRango1);
        System.out.println("Vehículos que pagaron más de $20.000: " + contadorRango2);
        System.out.println("Total recaudado por el parqueadero: $" + totalRecaudado);

        sc.close();
    }
}