package unidad2;
import java.util.Scanner;

class Participante {
    String nombre;
    double marca2024;
    double marca2025;
    double marca2026;
    int dorsal;

    public Participante(int dorsal, String nombre, double m2024, double m2025, double m2026) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.marca2024 = m2024;
        this.marca2025 = m2025;
        this.marca2026 = m2026;
    }
}

public class SaltoLongitud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Participante[] lista = new Participante[10];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Inscribir participante");
            System.out.println("2. Mostrar listado de datos");
            System.out.println("3. Mostrar listado por marcas (2024)");
            System.out.println("4. Finalizar");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (contador < 10) {
                        sc.nextLine(); // limpiar buffer
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Mejor marca 2024: ");
                        double m2024 = sc.nextDouble();

                        System.out.print("Mejor marca 2025: ");
                        double m2025 = sc.nextDouble();

                        System.out.print("Mejor marca 2026: ");
                        double m2026 = sc.nextDouble();

                        lista[contador] = new Participante(contador + 1, nombre, m2024, m2025, m2026);
                        contador++;
                    } else {
                        System.out.println("No hay más cupos.");
                    }
                    break;

                case 2:
                    System.out.println("\nListado por dorsal:");
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Dorsal: " + lista[i].dorsal +
                                " | Nombre: " + lista[i].nombre +
                                " | 2024: " + lista[i].marca2024 +
                                " | 2025: " + lista[i].marca2025 +
                                " | 2026: " + lista[i].marca2026);
                    }
                    break;

                case 3:
                    // Copia para ordenar
                    Participante[] copia = new Participante[contador];
                    for (int i = 0; i < contador; i++) {
                        copia[i] = lista[i];
                    }

                    // Ordenar de mayor a menor por marca 2024
                    for (int i = 0; i < contador - 1; i++) {
                        for (int j = 0; j < contador - i - 1; j++) {
                            if (copia[j].marca2024 < copia[j + 1].marca2024) {
                                Participante temp = copia[j];
                                copia[j] = copia[j + 1];
                                copia[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("\nListado ordenado por marca 2024:");
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Nombre: " + copia[i].nombre +
                                " | Marca 2024: " + copia[i].marca2024);
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}

