import java.util.Scanner;

public class KeyboardScanner {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        
        System.out.print("Enter a floating point number :");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String stringValue = scanner.nextLine();

        
        System.out.println("Hi! "+stringValue+", the sum of "+intValue+" and "+doubleValue+" is "+(intValue+doubleValue));
       

        // Close the scanner
        scanner.close();
    }
}
