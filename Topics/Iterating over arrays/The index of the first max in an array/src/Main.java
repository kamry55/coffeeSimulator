import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int len = scan.nextInt();
    int [] array = new int[len];
    int max = scan.nextInt();
    int maxI = 0;
    for (int i = 1; i < len; i++) {
        array[i] = scan.nextInt();
        if (max< array[i]) {
            max = array[i];
            maxI = i;
        }
    }
    System.out.println(maxI);
    }
}