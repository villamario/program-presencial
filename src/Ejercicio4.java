import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        String objeto[] = new String[]{"piedra", "papel", "tijera"};

        int J1 = 0;
        int J2 = 0;
        int jugadaJ1 = 0;
        int jugadaJ2 = 0;

        jugadaJ1 = mostrar_objeto(objeto, "J1");
        jugadaJ2 = mostrar_objeto(objeto, "J2");

        jugada(J1, jugadaJ1, jugadaJ2, J2, objeto);
    }

    public static int mostrar_objeto(String[] objeto, String jugador) {
        Scanner teclado = new Scanner(System.in);
        int jugada;
        do {
            System.out.println(jugador);
            jugada = teclado.nextInt();

            if (jugada < 0 || jugada >= objeto.length) {
                System.out.println("Error: Jugada fuera de rango");
            }
        } while (jugada < 0 || jugada >= objeto.length);

        System.out.println(objeto[jugada]);
        return jugada;
    }

    public static void jugada ( int J1, int jugadaJ1, int jugadaJ2, int J2, String[] objeto){
        if (jugadaJ1 == jugadaJ2) {
            System.out.println("Empate");
        } else if ((jugadaJ1 == 0 && jugadaJ2 == 1) || (jugadaJ1 == 1 && jugadaJ2 == 2) || (jugadaJ1 == 2 && jugadaJ2 == 0)) {
            System.out.println("J2 ha ganado");
        } else {
            System.out.println("J1 ha ganado");
        }
    }
}





