package unidad1;

import java.util.Scanner;

public class Ejercicio2par {
public static void main(String[] args) {
    int numstud; 
    Scanner sc = new Scanner(System.in);
    System.out.println("ingrese la cantidad de estudiantes : ");
    numstud = sc.nextInt();
    Double [] notas = new Double[numstud];

    for(int i = 0; i < numstud; i++){
        System.out.println("ingrese la nota del estudiante" + (i +  1) + ": ");
        notas [i] = sc.nextDouble();
    }
    double mayor = notas [0];
    double menor = notas [0];
    double suma = 0;
    int aprobados = 0;
    int reprobados = 0;

    for (int i = 0; i < numstud; i++){
        if (notas[i] > mayor) {
            mayor = notas[i];            
        }
        if (notas[i] < menor) {
            menor = notas[i];
        }
        suma += notas[i];
        if (notas[i] >= 3.0) 
            aprobados++;
            else {
               reprobados++; 
            }  
    }
    double promedio = suma / numstud;
    System.out.println("/numstud  notas ingresadas");
    for (int i = 0; i < numstud; i++){
        System.out.println("estudiante " + (i + 1) + ": " + notas[i]);
    }
    System.out.println("nota mas alta: "+ mayor);
    System.out.println("nota mas baja: "+ menor);
    System.out.println("promedio: "+ promedio);
    System.out.println("aprobados: "+ aprobados);
    System.out.println("reprobados: "+ reprobados);

    sc.close();
}
}
