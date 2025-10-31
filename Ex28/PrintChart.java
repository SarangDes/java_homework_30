

import java.util.Scanner;

public class PrintChart {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter of bars :");
		int n =s.nextInt();
		int bar[]=new int[n];
		int i=0;
		while(i<n) {
			System.out.println("Enter bar "+i+" value :");
			int n1=s.nextInt();
			if(n1<0) {System.out.println("enter opsitive value only");}
			else {
				bar[i]=n1;
				i++;
			}
		}
		for(i=0;i<n;i++) {
			for (int j=0;j<bar[i];j++) {
				System.out.print("*");
			}
			System.out.println("("+bar[i]+")");
		}
	}
}
