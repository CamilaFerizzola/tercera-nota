package unidad2;
import java.util.Scanner;

public class SumaFilasColumnas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        System.out.println("Ingrese los valores de la matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Valor [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;

            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }

            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }
        
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;

            for (int i = 0; i < 5; i++) {
                sumaColumna += matriz[i][j];
            }

            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }

        sc.close();
    }
}