package unidad2;
import java.util.Scanner;

public class DatosMeses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                                 "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] cantidadDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.print("Ingrese el número del mes (1 a 12): ");
        int numeroMes = sc.nextInt();
        
        if (numeroMes >= 1 && numeroMes <= 12) {
            
            System.out.println("Mes: " + nombresMeses[numeroMes - 1]);
            System.out.println("Cantidad de días: " + cantidadDias[numeroMes - 1]);
        } else {
            System.out.println("Número de mes no válido. Debe ser entre 1 y 12.");
        }

        sc.close();
    }
}