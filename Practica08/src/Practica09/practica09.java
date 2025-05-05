
package Practica09;

import java.util.Scanner;
import java.util.Random;

public class practica09 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        scan.useDelimiter("\n");
        
        System.out.println("Menu: ");
        System.out.println("1 - Exercise 1");
        System.out.println("2 - Exercise 2");
        System.out.println("3 - Exercise 3");
        System.out.println("4 - Exercise 4");
        System.out.println("5 - Exercise 5");
        System.out.println("6 - Exercise 6");
        System.out.println("7 - Exercise 7");
        System.out.println("8 - Exercise 8");
        System.out.println("Enter option: ");
        String opcion = scan.next();
        
        switch (opcion) {
            case "1":
                exercise01();
                break;
            case "2":
                exercise02();
                break;
            case "3":
                exercise03();
                break;
            case "4":
                exercise04();
                break;
            case "5":
                exercise05();
                break;
            case "6":
                exercise06();
                break;
            case "7":
                exercise07();
                break;
            case "8":
                exercise08();
                break;
            default:
                System.out.println("Wrong option");
                break;
        }

    }  // FIN del MAIN
    
 
    static void exercise01(){
        
        int [] numbers = new int[10];
        
        System.out.println("Introduce 10 numeros: ");
        
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Numero " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }
         System.out.println("Los numeros en orden inverso son:");
        for (int i = numbers.length - 1; i > 0; i--){
            System.out.println(numbers[i]);
        
    }
}
   
    
    static void exercise02(){
        int [] numero = new int [20];
        int [] cuadrado = new int [20];
        int [] cubo = new int [20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numero[i] = random.nextInt(101);
        }
        for (int i = 0; i < numero.length; i++) {
             cuadrado[i] = numero[i] * numero[i]; // Calcula el cuadrado
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
         System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%d\t%d\t%d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
 
    
    static void exercise03(){
        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        System.out.println("Introduce 10 numeros:");
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = scan.nextInt();
 
    
    if (numeros[i] > maximo) {
        maximo = numeros[i];
    }
    if (numeros[i] < minimo) {
        minimo = numeros[i];
    }
}
 
    System.out.println("Numeros introducidos:");
for (int i = 0; i < numeros.length; i++) {
    System.out.print(numeros[i]);
 
    
    if (numeros[i] == maximo) {
        System.out.print(" (maximo)");
    }
    if (numeros[i] == minimo) {
        System.out.print(" (minimo)");
    }
    }
}
    
    
    static void exercise04(){
        String[] palabras = new String[15];
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 15 palabras:");
        for (int i = 0; i < palabras.length; i++) {
    palabras[i] = scan.nextLine();
}
        String ultimaPalabra = palabras[palabras.length - 1];
        for (int i = palabras.length - 1; i > 0; i--) {
    palabras[i] = palabras[i - 1];
}
        palabras[0] = ultimaPalabra;
        System.out.println("\nContenido del array después de la rotacion:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Posicion " + i + ": " + palabras[i]);
        }
    }
    
    
    static void exercise05(){
        
        int[] numero = new int[100];
        
        Random random = new Random();
        
        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(21);           
        }
        
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "  ");
        }
        System.out.println();      
        
        System.out.println("Ingresa un valor: ");
        int valor1 = scan.nextInt();
        
         System.out.println("Ingresa un valor: ");
        int valor2 = scan.nextInt();
        
        for (int i = 0; i < numero.length; i++) {
            
            if(numero[i] == valor1)
            {
                 numero[i]= valor2; 
            }
            
            System.out.print(numero[i] + "  ");
        }
        System.out.println();       
    }
    
    
    static void exercise06(){
        int [] numero= new int [8];
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingrese el numero: " + (i + 1));
            numero[i]=scan.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "  ");
        }
        System.out.println();
        
        for (int i = 0; i < numero.length; i++) {
         if(numero[i] % 2 == 0)
         {
             System.out.println(numero[i] + "   " +  "par");
         }
         else
         {
             System.out.println(numero[i] + "   " +  "impar");
         }
        }
    } 
    
    
    static void exercise07(){
            int [] numero= new int [10];
            
            int [] primicos= new int [10];
            int primo =0;
            int noPrimo = primicos.length -1;
            for (int i = 0; i < numero.length; i++) {
                numero[i]=scan.nextInt();
            }
            for (int i = 0; i < numero.length; i++) {
                System.out.println(numero[i] + "  ");
            }
            System.out.println();
            
            System.out.println("Array Modificado");
            
            for (int i = 0; i < 10; i++) {
                int num = numero[i];
                boolean esPrimo= true;
                if( num <= 1  )
                {
                    esPrimo= false;
                }
                for (int j = 2; j <=Math.sqrt(num); j++) {
                    
                    if(num % j ==0)
                    {
                        esPrimo= false;
                        break;                                                
                    }
               if (esPrimo) {
                primicos[primo] = num; // Los primos van al inicio
                primo++;
            } else {
                primicos[noPrimo] = num; // Los no primos van al final
                noPrimo--;
            }
        }

        // Mostrar el array modificado
        System.out.println("\nArray modificado:");
        for (int j = 0; j < primicos.length; j++) {
            System.out.println("Índice " + j + ": " + primicos[i]);
        }
                    
                        
                    
    }
    }
    

    static void exercise08(){
        Scanner scan = new Scanner(System.in);

        
        String[] coloresConocidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "púrpura"};

        
        String[] palabras = new String[8];
        String[] resultado = new String[8];

        
        int indiceColor = 0; 
        int indiceNoColor = palabras.length - 1; 

       
        System.out.println("Introduce 8 palabras:");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = scan.nextLine().toLowerCase();
        }

       
        for (String palabra : palabras) {
            boolean esColor = false;

            
            for (String color : coloresConocidos) {
                if (palabra.equals(color)) {
                    esColor = true;
                    break;
                }
            }

            
            if (esColor) {
                resultado[indiceColor] = palabra;
                indiceColor++;
            } else {
                resultado[indiceNoColor] = palabra; 
                indiceNoColor--;
            }
        }

        
        System.out.println("\nArray inicial:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("\u00cdndice " + i + ": " + palabras[i]);
        }

       
        System.out.println("\nArray organizado:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("\u00cdndice " + i + ": " + resultado[i]);
        }

       
    }
    


}



        
        


    

