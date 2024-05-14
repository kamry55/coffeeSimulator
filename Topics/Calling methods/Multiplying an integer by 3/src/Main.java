import java.util.Scanner;

public class Main {
    static void multiply(int n){
       int result= n * 3;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user using scanner
        int n = scanner.nextInt();

        multiply(n);
        // Call the multiply method here with 'n' as argument and print result
    }
}
