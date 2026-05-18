package unidad2;
import java.util.Scanner;

public class VentasEmpresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        double[] precios = new double[5];
        int[][] cantidades = new int[4][5];
        
        System.out.println("Ingrese el precio de los 5 artículos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Precio artículo " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }
        
        System.out.println("\nIngrese las cantidades vendidas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Sucursal " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("Artículo " + (j + 1) + ": ");
                cantidades[i][j] = sc.nextInt();
            }
        }
        
        int[] totalArticulos = new int[5];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++) {
                totalArticulos[j] += cantidades[i][j];
            }
        }

        double[] recaudacionSucursal = new double[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                recaudacionSucursal[i] += cantidades[i][j] * precios[j];
            }
        }
        
        double totalEmpresa = 0;
        for (int i = 0; i < 4; i++) {
            totalEmpresa += recaudacionSucursal[i];
        }
        
        double mayorRecaudacion = recaudacionSucursal[0];
        int sucursalMayor = 1;

        for (int i = 1; i < 4; i++) {
            if (recaudacionSucursal[i] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal[i];
                sucursalMayor = i + 1;
            }
        }

        System.out.println("\nCantidad total vendida de cada artículo:");
        for (int j = 0; j < 5; j++) {
            System.out.println("Artículo " + (j + 1) + ": " + totalArticulos[j]);
        }

        System.out.println("\nCantidad de artículos en la sucursal 2:");
        int totalSucursal2 = 0;
        for (int j = 0; j < 5; j++) {
            totalSucursal2 += cantidades[1][j];
        }
        System.out.println(totalSucursal2);

        System.out.println("\nCantidad del artículo 3 en la sucursal 1:");
        System.out.println(cantidades[0][2]);

        System.out.println("\nRecaudación total por sucursal:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Sucursal " + (i + 1) + ": $" + recaudacionSucursal[i]);
        }

        System.out.println("\nRecaudación total de la empresa: $" + totalEmpresa);

        System.out.println("\nSucursal con mayor recaudación: Sucursal " + sucursalMayor);

        sc.close();
    }
}