package unidad2;
import java.util.Scanner;

public class VentasTienda {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de ventas realizadas: ");
        int n = sc.nextInt();

        double[] ventas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor de la venta " + (i + 1) + ": $");
            ventas[i] = sc.nextDouble();
        }

        int contadorRango1 = 0; 
        int contadorRango2 = 0; 
        double totalVendido = 0; 

        for (int i = 0; i < n; i++) {
            totalVendido += ventas[i];

            if (ventas[i] >= 50 && ventas[i] <= 500) {
                contadorRango1++;
            } 
            else if (ventas[i] > 500) {
                contadorRango2++;
            }
        }

        System.out.println("Cantidad de ventas entre $50 y $500: " + contadorRango1);
        System.out.println("Cantidad de ventas mayores a $500: " + contadorRango2);
        System.out.printf("Total vendido por la tienda: $%.2f%n", totalVendido);

        sc.close();
    }
}