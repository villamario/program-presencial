import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la altura");
        int altura = teclado.nextInt();
        int base = altura/2;
        char array[][] = new char[altura][altura];
        generar_palo(altura, base);
    }

    private static void generar_palo(int altura, int base) {

        for (int i = 0; i < altura-1; i++) {

            System.out.println("*");
        }

        // Generar la parte horizontal de la "L"
        for (int j = 0; j < (altura / 2)+1; j++) {

            System.out.print("* ");

        }
    }
}


