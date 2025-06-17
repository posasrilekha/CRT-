import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    double operate(double a, double b);
}

public class Lambdaswitch {

    public static void main(String[] args) {
        // Lambda expressions for operations
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Error: Division by zero");
                return 0;
            }
            return a / b;
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = add.operate(num1, num2);
                break;
            case '-':
                result = subtract.operate(num1, num2);
                break;
            case '*':
                result = multiply.operate(num1, num2);
                break;
            case '/':
                result = divide.operate(num1, num2);
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
