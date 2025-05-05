
package ejemplo;
import java.util.Scanner;

public class arrays {    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please select an exercise (1-5): 4");
        System.out.print("Enter the number of hours worked: ");
        
        double hoursWorked = scanner.nextDouble();
        
        if (hoursWorked < 0) {
            System.out.println("Hours worked cannot be negative.");
        } else {
            double totalWage = calculateWeeklyWage(hoursWorked);
            System.out.printf("The total weekly wage is €%.2f.%n", totalWage);
        }
        
        scanner.close();
    }
    public static double calculateWeeklyWage(double hoursWorked) {
        double ordinaryRate = 10.0;  
        double overtimeRate = 12.0;   
        double ordinaryHours = Math.min(hoursWorked, 40);  
        double overtimeHours = Math.max(hoursWorked - 40, 0);  

        return (ordinaryHours * ordinaryRate) + (overtimeHours * overtimeRate);
    }
    }
    
    