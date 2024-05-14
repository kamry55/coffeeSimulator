import java.util.Scanner; // 3.1 Import necessary library

public class Main { // 3.6 Always use 'Main' as class name
    public static int returnFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * returnFactorial(n -1);
        }
    }
    // 3.0 No method main code here, user write their own

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter a number representing n: ");
        int n = scanner.nextInt();
     int factorial = returnFactorial(n);
     System.out.println(factorial);
        // TODO: 2. Print the factorial of 'n'

        scanner.close(); // Always close the scanner when done
    }

}