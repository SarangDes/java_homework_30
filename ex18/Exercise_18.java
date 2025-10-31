

import java.util.Scanner;

class Test{
	public static boolean hasEight(int number) 
	{
		if(number<0)number*=-1;
		while(number>0) {
			int r=number%10;
			if(r==8) return true;
		}
		return false;
	}
}
public class Exercise_18 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number :");
		int n =s.nextInt();
		if(Test.hasEight(n)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}

}
