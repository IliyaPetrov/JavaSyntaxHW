import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        System.out.println("Enter your target");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int k = 1; k <= 20; k++) {
                if (i - k == target)
                    System.out.printf("%d - %d = %d %n", i, k, target);
                else if (i + k == target)
                    System.out.printf("%d + %d = %d %n", i, k, target);

            }
        }
    }
}
