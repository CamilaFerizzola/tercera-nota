package unidad2;
import java.util.Scanner;

public class GastosClientesRestaurante {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de clientes atendidos: ");
        int n = sc.nextInt();
        
        int[] gastos = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el gasto del cliente " + (i + 1) + ": $");
            gastos[i] = sc.nextInt();
        }
        
        int contadorRango1 = 0; 
        int contadorRango2 = 0; 
        int totalDinero = 0;     
        
        for (int i = 0; i < n; i++) {
            
            totalDinero += gastos[i];
            
            if (gastos[i] >= 20000 && gastos[i] <= 100000) {
                contadorRango1++;
            } 
            else if (gastos[i] > 100000) {
                contadorRango2++;
            }
        }

        System.out.println("Clientes que gastaron entre $20.000 y $100.000: " + contadorRango1);
        System.out.println("Clientes que gastaron más de $100.000: " + contadorRango2);
        System.out.println("Total de dinero recibido: $" + totalDinero);

        sc.close();
    }
}