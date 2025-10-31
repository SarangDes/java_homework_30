import java.util.Scanner;
class Nested_if
{
	void Nest(int n){
		if(n<0){
			System.out.println("number is less than 0 ");
		}else{
			if(n>6){
				System.out.println("not valid");
			}else{
				
				if(n==6){System.out.println("Saturday");}
				if(n==5){System.out.println("friday");}
				if(n==4){System.out.println("thrusday");}
				if(n==3){System.out.println("wendesday");}
				if(n==2){System.out.println("tuesday");}
				if(n==1){System.out.println("monday");}
				if(n==0){System.out.println("Sundaay");}
												
				}		
		}
	}
}
class Switch 
{
	void se(int n ){
		switch (n){
			case 0: System.out.println("Sundaay");
					break;
			case 1 : System.out.println("monday ");
				    break ;
			case 2 : System.out.println("tuesday");
				    break ;
			case 3 : System.out.println("wendesday");
				    break ;					
			case 4 : System.out.println("thrusday");
				    break ;
			case 5 : System.out.println("friday");
				    break ;
			case 6 : System.out.println("Saturday");
				    break ;
			
			default : System.out.println("not valid ");
		
		}
	}
}
public class PrintDayInWord  {
	public static void main (String a[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n= s.nextInt();
		System.out.println("Enter 1 for  nested 2 for switch:");
		int ch  = s.nextInt();
		if (ch==1){
		Nested_if d =new Nested_if();
		d.Nest(n);
		}
		else {
			Switch  d =new Switch();
		d.se(n);
		}
		
	}
}
