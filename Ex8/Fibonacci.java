import java.util.Scanner;
public class Fibonacci {
	public static void main (String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter range of fibonachi : ");
		int n= s.nextInt();
		float sum1=0;
		int b=0,a=1;
		System.out.println(a);
		for (int i=2;i<=n;i++){
			
			int next  = a +b;
			b=a;
			a=next;
			sum1+=(float)next;
			
			System.out.println(next);
			 
		}
		System.out.println("Average is  "+(float)(sum1/n));
		
	}
}