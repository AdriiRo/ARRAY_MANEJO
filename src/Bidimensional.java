import java.util.Scanner;

public class Bidimensional {
    public static void main(String[] args) throws InterruptedException {

        final int MAX_CASILLAS = 9;
        Scanner sc = new Scanner(System.in);

        int contadorJugadas = 0;

        char[][] tableroJuego = new char[3][3];

        rellenarTableroInit(tableroJuego);

        do {
            jugarJ1(tableroJuego);  // Dado que dentro de este método llamamos al jugarJ2, no hace falta llamar a ambos métodos. Con llamar a uno, tendrán lugar los turnos de ambos jugadores 
            contadorJugadas++;
            
        } while (contadorJugadas <= MAX_CASILLAS);

    }

    public static void jugarJ1(char[][] tablero) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1 seleccionado");

        int selectorFila;
        int selectorColumna;

        do {
            System.out.println("Selecciona una fila: ");
            selectorFila = sc.nextInt() - 1;
            System.out.println("Selecciona una columna: ");
            selectorColumna = sc.nextInt() - 1;

            if (!esCasillaValida(tablero, selectorFila, selectorColumna)) {
                System.out.println("Casilla no válida. Por favor, elige otra.");
            }

        } while (!esCasillaValida(tablero, selectorFila, selectorColumna));

        tablero[selectorFila][selectorColumna] = 'X';

        mostrarTablero(tablero);
        jugarJ2(tablero);

    }

    public static void jugarJ2(char[][] tablero) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 2 seleccionado");

        int selectorFila;
        int selectorColumna;

        do {
            System.out.println("Selecciona una fila: ");
            selectorFila = sc.nextInt() - 1;
            System.out.println("Selecciona una columna: ");
            selectorColumna = sc.nextInt() - 1;

            if (!esCasillaValida(tablero, selectorFila, selectorColumna)) {
                System.out.println("Casilla no válida. Por favor, elige otra.");
            }

        } while (!esCasillaValida(tablero, selectorFila, selectorColumna));

        tablero[selectorFila][selectorColumna] = 'O';

        mostrarTablero(tablero);
        jugarJ1(tablero);

    }

    public static boolean esCasillaValida(char[][] tablero, int fila, int columna) {    // Este método verifica los valores que toman las celdas, y además revisa si están o no vacías
        if (fila < 0 || fila >= tablero.length || columna < 0 || columna >= tablero[0].length) {
            return false; // Fuera de los límites del tablero
        }

        return tablero[fila][columna] == '-'; // Devuelve el estado de la casilla (Si está o no ocupada) 
    }

    public static void rellenarTableroInit(char [] [] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero [i] [j] = '-';
            }
        }
    }

    public static void mostrarTablero(char [] [] tablero) {

        // Condición para que antes de mostrar el tablero determine si algún jugador ha ganado. (NO FUNCIONA)

        // for (int i = 0; i < tablero.length; i++) {
        //     for (int j = 0; j < tablero.length; j++) {
        //         if(tablero [i] [j] != '-') {
        //             System.out.println("El juego ha finalizado");
        //             break; 
        //         }
        //     }
        // }

        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero [i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    // Incompleto. Revisar solución de clase. 

    public static void comprobarGanador(int fila, int columna, char [] [] tablero) {
        if(tablero[fila][0] == tablero[fila][1] && tablero[fila][1] == tablero[fila][2] || tablero[0][columna] == tablero[1][columna] && tablero[1][columna] == tablero[2][columna]) {

        }
    } 
}

