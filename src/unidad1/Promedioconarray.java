package unidad1;

import java.util.Scanner;
public class Promedioconarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = sc.nextInt();
            suma += numeros[i]; 
        }
        double promedio = suma / (double) numeros.length;

        System.out.println("El promedio es: " + promedio);
        sc.close();
    }
}

