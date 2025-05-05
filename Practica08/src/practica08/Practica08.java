
package practica08;

import java.util.Scanner;

public class Practica08 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        scan.useDelimiter("\n");
        
        System.out.println("Menu: ");
        System.out.println("1 - Exercise 1");
        System.out.println("2 - Exercise 2");
        System.out.println("3 - Exercise 3");
        System.out.println("Enter option: ");
        int num = scan.nextInt();
        
        switch (num) {
            case 1:
                exercise01();
                break;
            case 2:
                exercise02();
                break;
            default:
                System.out.println("Wrong option");
                break;
        }

    }  // FIN del MAIN
        
    
static void exercise01(){
    System.out.println("Introduce un numero: ");
    int numero = scan.nextInt();
    numero = Math.abs(numero);
    
    int suma = 0;
    
    while (numero > 0){
        int digito = numero % 10;
        suma += digito;
        numero /= 10;
    }
    
    System.out.println("La suma total de los digitos es: " + suma);
}

static void exercise02(){
    
    System.out.println("Introduzca una frase o palabra: ");
    String frase = scan.next();
    
    System.out.println("Introduzca una letra: ");
    char letra = scan.next().toLowerCase().charAt(0);
    int contador = 0;
            
    for (int i = 0; i < frase.length(); i++) {
        if (frase.charAt(i) == letra) {
            contador++;
        }
              
    }
    System.out.println("La letra " + letra + " aparece " + contador + " veces.");
}

}


    

