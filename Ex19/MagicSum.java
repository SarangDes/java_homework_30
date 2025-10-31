
import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a positive integer or -1 to exit: ");
		int n=s.nextInt();
		int sum=0;
		while(n!=-1)
		{
			sum +=n;
			System.out.println("Enter a positive integer or -1 to exit: ");
			n=s.nextInt();	
		}
		System.out.println("The sum is : "+sum);
			
	}

}
