import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean isVowel = false;
        if (ch == 'a' || ch == 'A'||ch == 'e' || ch == 'E' ||ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' )
    isVowel = true;

    return isVowel;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}