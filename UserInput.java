package supriya;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        
        scanner.nextLine(); // Consume leftover newline
        
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String: " + stringValue);
        System.out.println("Character: " + charValue);
        
        scanner.close();
    }
}
