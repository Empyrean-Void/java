import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        }
    }

    public static void add() {
        double[] numbers = getNumbers();
        double result = numbers[0] + numbers[1];
        System.out.printf("%.2f + %.2f = %.2f%n", numbers[0], numbers[1], result);
    }

    public static void subtract() {
        double[] numbers = getNumbers();
        double result = numbers[0] - numbers[1];
        System.out.printf("%.2f - %.2f = %.2f%n", numbers[0], numbers[1], result);
    }

    public static void multiply() {
        double[] numbers = getNumbers();
        double result = numbers[0] * numbers[1];
        System.out.printf("%.2f * %.2f = %.2f%n", numbers[0], numbers[1], result);
    }

    public static void divide() {
        double[] numbers = getNumbers();
        if (numbers[1] == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return;
        }
        double result = numbers[0] / numbers[1];
        System.out.printf("%.2f / %.2f = %.2f%n", numbers[0], numbers[1], result);
    }

    public static double[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[2];

        System.out.println("Enter the first number:");
        numbers[0] = scanner.nextDouble();

        System.out.println("Enter the second number:");
        numbers[1] = scanner.nextDouble();

        return numbers;
    }
}
