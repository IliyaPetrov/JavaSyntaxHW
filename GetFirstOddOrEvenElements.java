import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        String[] command = scanner.nextLine().split(" ");
        String oddOrEven = command[2];
        int nrOfElements = Integer.parseInt(command[1]);
        int counter = 0;


        for (int i = 0; i < numbers.length; i++) {


            if ((oddOrEven.equals("odd") && Integer.parseInt(numbers[i]) % 2 != 0) || (oddOrEven.equals("even") && Integer.parseInt(numbers[i]) % 2 == 0)) {

                nrOfElements--;
                System.out.printf("%s ", numbers[i]);
                if (nrOfElements == 0)
                    break;

            }


        }


    }
}
