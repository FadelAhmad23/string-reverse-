import java.util.Scanner;

public class ReverseString {
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("olleH");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Hello" + reverse(input));
    }
}
