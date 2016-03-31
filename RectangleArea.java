import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of each side of the rectangle with space between them");
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int area = sideA * sideB;
        System.out.println(area);
    }
}
