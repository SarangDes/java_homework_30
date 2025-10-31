import java.util.Scanner;
public class ReverseString  {
	public static void main (String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string : ");
		String   str1  = s.nextLine();
		String   str2="";
		for (int i=str1.length()-1;i>=0;i--){
			str2+=str1.charAt(i);
		}
		System.out.println("The reverser of "+str1+" is "+str2);	
		
		
	}
}