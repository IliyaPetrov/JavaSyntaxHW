import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizeNumbersNtoM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        Random rnd = new Random();
        ArrayList<Integer> randomNums = new ArrayList<Integer>();

        while (randomNums.size() != Math.abs(firstNumber - secondNumber) + 1) {
            int rand = ThreadLocalRandom.current().nextInt(Math.min(firstNumber, secondNumber), Math.max(firstNumber, secondNumber) + 1);
            if (!randomNums.contains(rand))
                randomNums.add(rand);

        }
        System.out.println(randomNums);
    }
}

