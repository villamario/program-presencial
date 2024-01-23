import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        generar_numeros();

    }

    public static void generar_numeros() {
        int numeros;
        int contador = 0;
        int totalnumeros = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            numeros = teclado.nextInt();
            if (numeros >= 0) {
                totalnumeros += numeros;
                contador++;
            }
        } while (numeros >= 0);
        double media = totalnumeros / contador;
        System.out.println(media);

    }
}
