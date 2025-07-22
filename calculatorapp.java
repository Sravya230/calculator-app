import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0)
                        System.out.println("Result: " + (num1 / num2));
                    else
                        System.out.println("❌ Cannot divide by zero!");
                    break;
                case '%':
                    if (num2 != 0)
                        System.out.println("Result: " + (num1 % num2));
                    else
                        System.out.println("❌ Cannot modulo by zero!");
                    break;
                default:
                    System.out.println("❌ Invalid operator!");
            }

            System.out.print("Another calculation? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thanks for using Calculator!");
        sc.close();
    }
}
