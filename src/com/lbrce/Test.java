package com.lbrce;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // Load file
    	
        File file = new File("C:\\Users\\karth\\OneDrive\\Desktop\\avinash\\file.txt.txt");
        Scanner scanner = new Scanner(file);

        // Read numbers and operation from file
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        scanner.close();

        // Perform operation using switch
        switch (operation) {
            case '+':
                System.out.println("Sum: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Product: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Quotient: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
