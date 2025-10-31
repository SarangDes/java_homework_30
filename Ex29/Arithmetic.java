import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int n1=0,n2=0;
		char ch;
			
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[1]);
			ch= args[2].charAt(0);  
			switch(ch)
			{
				case '+' :System.out.println("Sum is : "+(n1+n2));
						break;
				case'-':System.out.println("sub is : "+(n1-n2));
						break;		
				case '*':System.out.println("mul is : "+(n1*n2));
						break;		
				case '/':System.out.println("divide is : "+(n1/n2));
						break;		
				default :System.out.println("not valid!!!!");
						break;		
			}
			
		
	}
}
