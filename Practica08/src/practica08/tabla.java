/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica08;
import java.util.Random;
/**
 *
 * @author jordipanand
 */
public class tabla {
    public static void main(String[] args) {
        
    
     Random rand = new Random();
        int vidaHeroe = 200;
        int vidaVillano = 200;

        System.out.println("El héroe tiene " + vidaHeroe + " puntos de vida.");
        System.out.println("El villano tiene " + vidaVillano + " puntos de vida.");

        // quién empieza
        int turno = rand.nextInt(2); // 0 = héroe, 1 = villano

        if (turno == 0) {
            System.out.println("Empezará el combate el héroe.");
        } else {
            System.out.println("Empezará el combate el villano.");
        }

        // Combate
        while (vidaHeroe > 0 && vidaVillano > 0) {
            int daño = rand.nextInt(81); // Daño entre 0 y 80

            if (turno == 0) {
                
                vidaVillano -= daño;
                System.out.println("El héroe ataca y causa " + daño + " puntos de daño.");
                if (vidaVillano <= 0) {
                    System.out.println("El villano ha sido derrotado. ¡El héroe gana!");
                    break;
                }
                turno = 1; // Cambiar turno 
            } else {
                
                vidaHeroe -= daño;
                System.out.println("El villano ataca y causa " + daño + " puntos de daño.");
                if (vidaHeroe <= 0) {
                    System.out.println("El héroe ha sido derrotado. ¡El villano gana!");
                    break;
                }
                turno = 0; 
            }

            // Mostrar vidas después de cada turno
            System.out.println("Vida del héroe: " + Math.max(0, vidaHeroe));
            System.out.println("Vida del villano: " + Math.max(0, vidaVillano));
            System.out.println("===============");
        }
    }
    
}
    