package unidad2;
import java.util.Scanner;

public class VectorInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String[] vector_original = new String[5];
        
        System.out.println("Ingresa 5 cadenas de caracteres:");
        for (int i = 0; i < vector_original.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector_original[i] = sc.nextLine();
        }
        
        String[] vector_inverso = new String[5];
        
        for (int i = 0; i < vector_original.length; i++) {
            
            vector_inverso[i] = vector_original[vector_original.length - 1 - i];
        }
        
        System.out.println("\nVector en orden inverso:");
        for (int i = 0; i < vector_inverso.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector_inverso[i]);
        }

        sc.close();
    }
}