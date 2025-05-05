import java.util.Scanner;

public class recuperacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeros;
        int subnirmal = 0;
        int gay = 0;
       
        do{
            System.out.println("Ingresa una serie de numeros: ");
            numeros = scanner.nextInt();
            if (numeros != 0) {
            if(numeros % 2 == 0)
            {
              
                subnirmal++;
            }else{
            
                gay++;
            }
            
            }  
        } while (numeros !=0 );
        System.out.println(gay);
            System.out.println(subnirmal);
            scanner.close();
    }
}

