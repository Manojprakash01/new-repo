package qus1;
import java.util.Scanner;
public class mat9 {
	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

       
        if (age >= 65) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }

      
        scanner.close();
    }
}
