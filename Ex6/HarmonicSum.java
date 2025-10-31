import java.util.Scanner;
public class HarmonicSum    {
	public static void main (String a[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number :");
		int n= s.nextInt();
		double left_sum=0;
		for (int i=1 ;i<=n;i++){
				
			left_sum = left_sum+ (1.0/i);
		}
		System.out.println("left to right sum :"+left_sum);
				double r_sum=0;
		for (int i=n ;i>=1;i--){
				
			r_sum = r_sum+ (1.0/i);
		}
		System.out.println("right to left:"+r_sum);
		if(left_sum==r_sum){	System.out.println("both are accurate ");}
		
	}
}