import java.util.Scanner;

public class OddTest {

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isOdd(number)) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }

        scanner.close();
    }
}
