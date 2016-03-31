import java.util.Scanner;

public class ConvertBaseSevenToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base-7 number");
        String baseSevNum = scanner.next();
        int decNum = 0;

        for (int i = baseSevNum.length() - 1, k = 0; i >= 0; i--, k++) {

            decNum += Character.getNumericValue(baseSevNum.charAt(i)) * Math.pow(7, k);

        }
        System.out.println(decNum);
    }
}
