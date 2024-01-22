import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduces nota 1");
        double nota_examen1= teclado.nextDouble();

        System.out.println("Cual es tu nota ideal?");
        double notafinal= teclado.nextDouble();
        double nota_examen2 = (notafinal - (nota_examen1 * 0.4)) / 0.6;

        System.out.printf( "%.2f", nota_examen2);

    }
}