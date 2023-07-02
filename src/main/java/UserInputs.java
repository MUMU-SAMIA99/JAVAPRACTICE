import java.util.Scanner;

//Write a program that will take integer numbers as user input continuously and
//print the sum of numbers until user input q from the keyboard.When user input q, program will be quit.
//If user inputs another character, then the program will ask to input the number again.
public class UserInputs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=s.nextInt();
        s = new Scanner(System.in);
        System.out.println("enter 2nd number");
        int num2=s.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is:"+ sum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String input = scanner.nextLine();
        while (!input.equals("q")) {
            System.out.println("You entered " + input);
            System.out.println("Enter a number:");
            input = scanner.nextLine();
        }
        System.out.println("Goodbye!");

    }
}
