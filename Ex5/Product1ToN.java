import java.util.Scanner;
public class Product1ToN   {
	public static void main (String a[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number till product you want :");
		int n= s.nextInt();
		long product=1;
		for (int i=1 ;i<=n;i++){
			product*= i;
		}
		System.out.println("product is  :"+product);
		
	}
}