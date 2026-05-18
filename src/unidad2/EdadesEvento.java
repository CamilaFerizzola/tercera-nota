package unidad2;
import java.util.Scanner;
public class EdadesEvento {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int n = sc.nextInt();

        int[] edades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int acumulador = 0;

        for (int i = 0; i < n; i++) {

            acumulador += edades[i];

            if (edades[i] >= 18 && edades[i] <= 30) {
                contadorRango1++;
            } 
            else if (edades[i] > 30) {
                contadorRango2++;
            }
        }

        System.out.println("Personas entre 18 y 30 años: " + contadorRango1);
        System.out.println("Personas mayores de 30 años: " + contadorRango2);
        System.out.println("Suma total de las edades: " + acumulador);

        sc.close();
    }
}