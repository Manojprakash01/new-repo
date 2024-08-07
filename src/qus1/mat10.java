package qus1;
import java.util.Scanner;
public class mat10 {
	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

      
        int digitCount = String.valueOf(number).length();

        
        System.out.println("The number of digits in " + number + " is: " + digitCount);

       
        scanner.close();
    }
}
