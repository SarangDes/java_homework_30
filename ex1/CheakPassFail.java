
import java.util.Scanner;
public class CheakPassFail{
public static void main (String []args){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter mark :");
	int mark = s.nextInt();
	if(mark<100&&mark<0){
		System.out.println("not valid");
	}else{
	if(mark>=50){System.out.println("Pass");}else{System.out.println("Fail ");}
	}
	System.out.println("Done");
	
}
}