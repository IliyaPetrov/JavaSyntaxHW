import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers.");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double formulaOne = Math.pow(((a * a + b * b) / (a * a - b * b)), ((a + b + c) / Math.sqrt(c)));
        double formulaTwo = Math.pow((a * a + b * b - c * c * c), (a - b));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f ", formulaOne, formulaTwo, Math.abs(getDifOfTwo(getAvgOfThree(a, b, c), getAvgOfTwo(formulaOne, formulaTwo))));
    }

    public static double getAvgOfTwo(double a, double b) {
        double avgNum = (a + b) / 2;
        return avgNum;

    }

    public static double getAvgOfThree(double a, double b, double c) {
        double avgNum = (a + b + c) / 3;
        return avgNum;

    }

    public static double getDifOfTwo(double a, double b) {
        double difference = a - b;
        return difference;
    }
}
