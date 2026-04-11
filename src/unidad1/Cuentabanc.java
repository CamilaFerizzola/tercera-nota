package unidad1;

public class Cuentabanc {
public static void main(String[] args) {
int saldo = 1000;
int retiro = 200;
int semanas = 4;

for(int i = 1; i <= semanas; i++ ){
saldo = saldo - retiro;
System.out.println("saldo despues de la semana: "+ i + saldo);
}
System.out.println("saldo final: "+ saldo);
}
}