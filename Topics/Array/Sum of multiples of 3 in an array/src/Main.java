import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner instance to read input
        Scanner scanner = new Scanner(System.in);

        // read the number of elements
        int n = scanner.nextInt();

        // create your array here
        int [] array = new int[n];
        // use a loop to read the array elements
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

int sum = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);

        // use a loop to calculate the sum of elements that are multiples of 3

        // close the scanner
        scanner.close();
    }
}