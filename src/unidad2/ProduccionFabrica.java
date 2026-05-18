package unidad2;
import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Ingrese la cantidad de operarios: ");
        int n = sc.nextInt();
        
        int[] produccion = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la producción del operario " + (i + 1) + " (unidades): ");
            produccion[i] = sc.nextInt();
        }
        
        int contadorRango1 = 0; 
        int contadorRango2 = 0; 
        int produccionTotal = 0; 
        
        for (int i = 0; i < n; i++) {
            
            produccionTotal += produccion[i];
            
            if (produccion[i] >= 10 && produccion[i] <= 100) {
                contadorRango1++;
            } 
            else if (produccion[i] > 100) {
                contadorRango2++;
            }
        }

        System.out.println("Operarios que produjeron entre 10 y 100 unidades: " + contadorRango1);
        System.out.println("Operarios que produjeron más de 100 unidades: " + contadorRango2);
        System.out.println("Producción total de la fábrica: " + produccionTotal + " unidades");

        sc.close();
    }
}