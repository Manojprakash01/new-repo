package qus1;
import java.util.Scanner;
public class mat4 {
	
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    System.out.println("Original values:");
    System.out.println("Number 1: " + num1);
    System.out.println("Number 2: " + num2);

    int temp = num1;
    num1 = num2;
    num2 = temp;
    
    System.out.println("Swapped values:");
    System.out.println("Number 1: " + num1);
    System.out.println("Number 2: " + num2);

       scanner.close();
	
}
}
