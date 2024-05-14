import java.util.Scanner;

public class Main {
    // Method 1: This method will compute the product of two numbers.
    static int product(int num1, int num2) {
        int newNum = num1 * num2;
        return newNum;
    }

    // Method 2: This method will compute the average of two numbers
    // and round it down to the nearest whole number.
    static int average(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        int roundedAverage = (int)Math.floor(average);
        return roundedAverage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        product(num1, num2);
        average(num1, num2);

        // Call the methods here and print the result.
        System.out.println(product(num1, num2));
        System.out.println(average(num1, num2));
    }
}
