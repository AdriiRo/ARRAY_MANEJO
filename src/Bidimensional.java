import java.util.Scanner;

public class Bidimensional {
    public static void main(String[] args) throws InterruptedException {

        final int MAX_CASILLAS = 9; 
        Scanner sc = new Scanner (System.in); 

        int contadorJugadas = 0; 
        
        char [] [] tableroJuego = new char[3][3];

        rellenarTableroInit(tableroJuego);

        do {
            jugarJ1(tableroJuego);
            contadorJugadas++;
        } while (contadorJugadas <= MAX_CASILLAS);


    }

    public static void jugarJ1(char [] [] tablero) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1 seleccionado");

        System.out.println("Selecciona una fila: ");
        int selectorFila = sc.nextInt() - 1 ;
        System.out.println("Selecciona una columna: ");
        int selectorColumna = sc.nextInt() - 1; 

        try {
            tablero [selectorFila] [selectorColumna] = 'X';
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Casilla no válida. Pierdes el turno");
        }

        mostrarTablero(tablero);
        jugarJ2(tablero);

    }

    public static void jugarJ2(char [] [] tablero) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 2 seleccionado");

        System.out.println("Selecciona una fila: ");
        int selectorFila = sc.nextInt() - 1 ;
        System.out.println("Selecciona una columna: ");
        int selectorColumna = sc.nextInt() - 1; 

        try {
            tablero [selectorFila] [selectorColumna] = 'O';
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Casilla no válida. Pierdes el turno");
        }

        mostrarTablero(tablero);
        jugarJ1(tablero);

    }

    public static void rellenarTableroInit(char [] [] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero [i] [j] = '-';
            }
        }
    }

    public static void mostrarTablero(char [] [] tablero) {
        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero [i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}

