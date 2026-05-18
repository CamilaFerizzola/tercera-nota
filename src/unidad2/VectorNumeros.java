package unidad2;
public class VectorNumeros {
    public static void main(String[] args) {

        int[] vector_numeros = new int[10];
        
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = (int) (Math.random() * 10) + 1;
        }
       
        System.out.println("Número | Cuadrado | Cubo");

        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println(numero + " | " + cuadrado + " | " + cubo);
        }
    }
}