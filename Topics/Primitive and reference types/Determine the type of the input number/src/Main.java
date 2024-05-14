import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
    try {
        int input = sc.nextInt();

        if (input > 0) {
            System.out.println("positive");
        } else if (input < 0) {
            System.out.println("negative");
        } else if (input == 0) {
            System.out.println("zero");
        }
    }
        catch
        (InputMismatchException e) {
            System.out.println("non-integer");
        }

        sc.close();
    }
}