
package Prac10;

import java.util.Scanner;
import java.util.Random;

public class practica10 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
    
    char [][] tablero = new char [5][5];
    for (int i = 0; i > 5; i++){
        for(int j = 0; j > 5; i++){
            tablero[i][j] = '.';   //para que apareczcan puntos en cada casilla del arrayd
        }
}
    Random random = new Random();
    int barcoFila = random.nextInt(5);
    int barcoColumna = random.nextInt(5);
    
    Scanner scan = new Scanner(System.in);
    boolean barcoHundido = false; // dice si el barco ha sido hundido o no
    
    
        while (!barcoHundido) {        // durante que el barco no este hundidio
            
            System.out.println("  A B C D E");    //enseñar el tablero
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

        System.out.println("Introduce tu primera jugada: ");   // para que el usuario haga su jugada
        String jugada = scan.nextLine();
        
        if (jugada.length()== 2 && jugada.charAt(0)>= '1' && jugada.charAt(0) <= '5' &&   // para que el usuario solo ponga valores 1-5
                jugada.charAt(1)>= 'A' && jugada.charAt(1) <= 'E'){                     //    "    "  "   "       "     "      "    A-E
            
            int fila = jugada.charAt(0) - '1';
            int columna = jugada.charAt(1) - 'A';
            
            if (fila == barcoFila && columna == barcoColumna) {
                    tablero[fila][columna] = '*';
                    barcoHundido = true;
                } else {
                    tablero[fila][columna] = 'x';
                }
            } else {
                System.out.println("Jugada inválida. Inténtalo de nuevo.");
            }
        }
    

    
        System.out.println("Has hundido el barco!! ");
        System.out.println("  A B C D E");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}




        
        
        
    


    

    

