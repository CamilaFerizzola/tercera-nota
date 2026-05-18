package unidad2;
import java.util.Scanner;

public class TemperaturasDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] minimas = new double[5];
        double[] maximas = new double[5];
        double[] medias = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Día " + (i + 1));

            System.out.print("Temperatura mínima: ");
            minimas[i] = sc.nextDouble();

            System.out.print("Temperatura máxima: ");
            maximas[i] = sc.nextDouble();
            
            medias[i] = (minimas[i] + maximas[i]) / 2;
        }
        
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Día " + (i + 1) + ": " + medias[i]);
        }

        double menorTemp = minimas[0];
        for (int i = 1; i < 5; i++) {
            if (minimas[i] < menorTemp) {
                menorTemp = (int) minimas[i];
            }
        }
        
        System.out.println("\nDías con la menor temperatura:");
        for (int i = 0; i < 5; i++) {
            if (minimas[i] == menorTemp) {
                System.out.println("Día " + (i + 1));
            }
        }
        
        System.out.print("\nIngrese una temperatura máxima a buscar: ");
        double buscar = sc.nextDouble();

        boolean encontrado = false;

        System.out.println("Días con esa temperatura máxima:");
        for (int i = 0; i < 5; i++) {
            if (maximas[i] == buscar) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe ningún día con esa temperatura máxima.");
        }

        sc.close();
    }
}