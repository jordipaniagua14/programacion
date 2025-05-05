

package Pasarjuego_cpp;
import java.util.Random;



public class juego_java {
    public static void main(String[] args) {
        
    
    Random rand = new Random();
        int vidaHeroe = 200;
        int vidaVillano = 200;

        System.out.println("El heroe tiene " + vidaHeroe + " puntos de vida.");
        System.out.println("El villano tiene " + vidaVillano + " puntos de vida.");

        // quién empieza
        int turno = rand.nextInt(2); 

        if (turno == 0) {
            System.out.println("Empezara el combate el heroe.");
        } else {
            System.out.println("Empezara el combate el villano.");
        }

        // Combate
        while (vidaHeroe > 0 && vidaVillano > 0) {
            int daño = rand.nextInt(81); // Daño entre 0 y 80

            if (turno == 0) {
                
                vidaVillano -= daño;
                System.out.println("El heroe ataca y causa " + daño + " puntos de daño.");
                if (vidaVillano <= 0) {
                    System.out.println("El villano ha sido derrotado. ¡El heroe gana!");
                    break;
                }
                turno = 1; // Cambiar turno 
            } else {
                
                vidaHeroe -= daño;
                System.out.println("El villano ataca y causa " + daño + " puntos de daño.");
                if (vidaHeroe <= 0) {
                    System.out.println("El heroe ha sido derrotado. ¡El villano gana!");
                    break;
                }
                turno = 0; 
            }

            // Mostrar vidas después de cada turno
            System.out.println("Vida del heroe: " + Math.max(0, vidaHeroe));
            System.out.println("Vida del villano: " + Math.max(0, vidaVillano));
            System.out.println("===============");
        }
    }
}
