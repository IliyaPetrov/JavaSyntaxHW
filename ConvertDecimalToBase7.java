import java.util.Scanner;

public class ConvertDecimalToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int decNumber = scanner.nextInt();
        String sevNumberRev = "";


        while (decNumber != 0) {
            int remainder = decNumber % 7;
            decNumber = decNumber / 7;
            sevNumberRev += remainder;

        }
        String sevNumber = new StringBuilder(sevNumberRev).reverse().toString();
        System.out.printf("Base-7 number: %s", sevNumber);
    }
}
