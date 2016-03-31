import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }


        if (list.size() % 2 != 0)
            System.out.print("Invalid length!");
        else {
            while (list.size() != 0) {
                if ((list.get(0) % 2 == 0) && (list.get(1) % 2 == 0)) {
                    System.out.printf("%d, %d -> both are even %n", list.get(0), list.get(1));
                } else if ((list.get(0) % 2 != 0) && (list.get(1) % 2 != 0)) {
                    System.out.printf("%d, %d -> both are odd %n", list.get(0), list.get(1));
                } else {
                    System.out.printf("%d, %d -> different %n", list.get(0), list.get(1));
                }
                list.subList(0, 2).clear();
            }


        }

    }
}
