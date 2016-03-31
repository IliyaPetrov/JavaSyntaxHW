import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings");

        String[] input = scanner.nextLine().split(" ");
        String stringOne = input[0];
        String stringTwo = input[1];
        long sum = charMultiplier(stringOne, stringTwo);
        System.out.print(sum);


    }

    public static long charMultiplier(String firstStr, String secondStr) {

        long sum = 0;
        String longString = firstStr;
        String shortString = secondStr;
        if (secondStr.length() == Math.max(firstStr.length(), secondStr.length())) {
            longString = secondStr;
            shortString = firstStr;
        }

        for (int i = 0; i < longString.length(); i++) {
            if (i >= shortString.length()) {
                sum += longString.charAt(i);
            } else sum += (int) firstStr.charAt(i) * (int) secondStr.charAt(i);
        }

        return sum;
    }
}