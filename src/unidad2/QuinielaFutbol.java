package unidad2;
import java.util.Scanner;

public class QuinielaFutbol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[][] equipos = new String[15][2];
        int[][] resultados = new int[15][2];
        
        for (int i = 0; i < 15; i++) {

            System.out.println("\nPartido " + (i + 1));

            System.out.print("Nombre del equipo 1: ");
            equipos[i][0] = sc.nextLine();

            System.out.print("Nombre del equipo 2: ");
            equipos[i][1] = sc.nextLine();

            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = sc.nextInt();

            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = sc.nextInt();

            sc.nextLine(); 
        }
        
        System.out.println("\n=== RESULTADOS DE LA QUINIELA ===");

        for (int i = 0; i < 15; i++) {

            System.out.println("\nPartido " + (i + 1));
            System.out.println(equipos[i][0] + " vs " + equipos[i][1]);
            System.out.println("Resultado: " + resultados[i][0] + " - " + resultados[i][1]);

            
            if (resultados[i][0] > resultados[i][1]) {
                System.out.println("Resultado quiniela: 1");
            } 
            else if (resultados[i][0] < resultados[i][1]) {
                System.out.println("Resultado quiniela: 2");
            } 
            else {
                System.out.println("Resultado quiniela: X");
            }
        }

        sc.close();
    }
}