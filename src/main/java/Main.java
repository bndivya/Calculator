import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter operator");
        String operator = scanner.next();

        System.out.println(calculator.operate(num1, num2, operator));
    }
}
