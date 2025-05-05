/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;



import java.util.Random;
/**
 *
 * @author jordipanand
 */
public class arrayss {
    
    public static void main(String []args){
        
        
        int[] myArray = new int[6];
        Random rand = new Random();
        // Ingresar los números en el array
        
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(10);
            System.out.print(myArray[i] + " ");
            
        }
        System.out.println("");
        
        System.out.println("Array en orden inverso:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("");
    }
}

