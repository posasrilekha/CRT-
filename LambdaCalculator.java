import java.io.*;
import java.util.*; 

interface Calculator {
    int operate(int a, int b);
}

public class LambdaCalculator {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
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

        
		int x=in.nextInt();
		int y=in.nextInt();


		System.out.println("Add: " + add.operate(x, y));
        System.out.println("Subtract: " + subtract.operate(x, y));
        System.out.println("Multiply: " + multiply.operate(x, y));
        System.out.println("Divide: " + divide.operate(x, y));
    }
}
