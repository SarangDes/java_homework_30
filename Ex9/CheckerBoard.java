import java.util.Scanner;
public class CheckerBoard  {
	public static void main (String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number : ");
		int n= s.nextInt();
	
		for (int i=0;i<n;i++){
			if(i%2!=0)System.out.print(" ");
			for (int j=0;j<n;j++){
				
					
				System.out.print("# ");
			}
		System.out.println("");	
		}
		
		
	}
}