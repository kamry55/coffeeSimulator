import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val = scanner.nextInt();
        switch (val) {

            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid");
        }
        // You can use nextLine method of scanner object to take the input from user

        // Use a switch statement here to determine the color of the traffic signal

    }
}