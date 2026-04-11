package unidad1;

public class Tiendaropejercicio {
public static void main(String[] args) {
    int camiseta = 25;
    int pantalon = 30;
    Double descuento = 0.15;

    double camisetaDesc = camiseta - (camiseta * descuento);
    double pantalonDesc = pantalon - (pantalon * descuento);

    double total = camisetaDesc + pantalonDesc;

    System.out.println("Total con una camiseta y un pantalon: " + total);

    double descuentoExtra = 0.05;
    double segundaCamiseta = camisetaDesc - (camisetaDesc * descuentoExtra);

    double totalFinal = total + segundaCamiseta;

    System.out.println("Total con segunda camiseta: " + totalFinal);





}
}