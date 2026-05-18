package unidad2;
import java.util.Scanner;

public class SumaVectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
      
        System.out.println("Ingrese 5 números para el primer vector:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = sc.nextInt();
        }
        
        System.out.println("\nIngrese 5 números para el segundo vector:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        
        System.out.println("\nResultado de la suma (vector3):");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector3[i]);
        }

        sc.close();
    }
}