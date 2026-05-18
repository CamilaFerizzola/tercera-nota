package unidad2;
import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes del curso: ");
        int n = sc.nextInt();
        
        double[] notas = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        int contadorRango1 = 0; 
        int contadorRango2 = 0; 
        double sumaTotal = 0;   

        for (int i = 0; i < n; i++) {
            
            sumaTotal += notas[i];
            
            if (notas[i] >= 3.0 && notas[i] <= 4.0) {
                contadorRango1++;
            } 
            else if (notas[i] > 4.0) {
                contadorRango2++;
            }
        }

        System.out.println("Estudiantes con nota entre 3.0 y 4.0: " + contadorRango1);
        System.out.println("Estudiantes con nota mayor a 4.0: " + contadorRango2);
        System.out.println("Suma total de todas las notas: " + sumaTotal);

        sc.close();
    }
}
