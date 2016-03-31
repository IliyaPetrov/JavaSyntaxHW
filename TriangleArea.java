import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Enter the coordinates of the first point!");
        Scanner scanner = new Scanner(System.in);
        int aX = scanner.nextInt();
        int aY = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the coordinates of the second point!");
        int bX = scanner.nextInt();
        int bY = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the coordinates of the third point!");
        int cX = scanner.nextInt();
        int cY = scanner.nextInt();
        double triangleArea = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);

        System.out.println(Math.round(triangleArea));


    }
}
