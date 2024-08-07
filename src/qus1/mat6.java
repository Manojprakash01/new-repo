package qus1;
import java.util.Scanner;
public class mat6 {

	public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

       
        long iterativeFactorial = factorialIterative(number);
        System.out.println("Factorial of " + number + " (iterative) is: " + iterativeFactorial);

        
        long recursiveFactorial = factorialRecursive(number);
        System.out.println("Factorial of " + number + " (recursive) is: " + recursiveFactorial);

       
        scanner.close();
    }

    
    public static long factorialIterative(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

   
    public static long factorialRecursive(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorialRecursive(num - 1);
        }
    }

}
