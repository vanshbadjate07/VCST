import java.util.Scanner;

public class VCST {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Perform multiplication
        int product = num1 * num2;
        
        // Display the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        
        // Close the scanner
        scanner.close();
    }
}

