import java.util.Scanner;

public class Main {
    // Declare the method 'countCharacters'
    public static int countCharacters(String inputString) {
        return inputString.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // Call 'countCharacters' method with the input string
        int length = countCharacters(inputString);
        System.out.println(length);

        scanner.close();
    }
}