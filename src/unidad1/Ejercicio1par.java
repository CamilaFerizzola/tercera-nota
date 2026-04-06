package unidad1;

import java.util.Scanner;

public class Ejercicio1par {
    public static void main(String[] args) {
        String nombre;
        Double documento;
        int puntaje;
        String clasificacion = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre del empleado : ");
        nombre = sc.nextLine();
        System.out.println("ingrese el documento : ");
        documento = sc.nextDouble();
        System.out.println("ingrese el puntaje de desempeño : ");
        puntaje = sc.nextInt();

        if (puntaje <= 59) {
            clasificacion = "Desempeño insuficiente ";
        } else if (puntaje <= 74) {
            clasificacion = "Desempeño aceptable ";
        } else if (puntaje <= 89) {
            clasificacion = "tiene buen desempeño ";
        }
        System.out.println("Resultados : ");
        System.out.println("Nombre : " + nombre);
        System.out.println("Documento : " + documento);
        System.out.println("Puntaje : " + puntaje);
        System.out.println("Clasificacion : " + clasificacion);
        sc.close();
    }
}
