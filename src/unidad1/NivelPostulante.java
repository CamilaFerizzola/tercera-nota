package unidad1;
import java.util.Scanner;

public class NivelPostulante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad total de preguntas: ");
        int totalPreguntas = sc.nextInt();

        System.out.print("Ingrese cantidad de respuestas correctas: ");
        int correctas = sc.nextInt();
        
        double porcentaje = (correctas * 100.0) / totalPreguntas;

        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }

        sc.close();
    }
}