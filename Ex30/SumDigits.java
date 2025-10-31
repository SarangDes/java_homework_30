import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		int sum =0;
		int n= Integer.parseInt(args[0]);
		while(n>0){
			int r=n%10;
			sum+=r;
			n/=10;
		}		
		System.out.println(sum);
	}
}
