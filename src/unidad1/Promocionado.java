package unidad1;
import java.util.Scanner;

public class Promocionado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = sc.nextDouble();
        
        double promedio = (nota1 + nota2 + nota3) / 3;
        
        if (promedio >= 7) {
            System.out.println("Promocionado");
        }

        sc.close();
    }
}