import java.util.Scanner;
class Nested_if
{
	void Nest(int n){
		if(n<=0){
			System.out.println("number is less than 0 ");
		}else{
			if(n>9){
				System.out.println("OTHER");
			}else{
				if(n==9){System.out.println("NINE");}
				if(n==8){System.out.println("EIGHT");}
				if(n==7){System.out.println("SEVEN");}
				if(n==6){System.out.println("SIX");}
				if(n==5){System.out.println("FIVE");}
				if(n==4){System.out.println("FOUR");}
				if(n==3){System.out.println("THREE");}
				if(n==2){System.out.println("TWO");}
				if(n==1){System.out.println("ONE");}
												
				}		
		}
	}
}
class Switch 
{
	void se(int n ){
		switch (n){
			case 1 : System.out.println("ONE");
				    break ;
			case 2 : System.out.println("TWO");
				    break ;
			case 3 : System.out.println("THREE");
				    break ;					
			case 4 : System.out.println("FOUR");
				    break ;
			case 5 : System.out.println("FIVE");
				    break ;
			case 6 : System.out.println("SIX");
				    break ;
			case 7 : System.out.println("SEVEN");
				    break ;
			case 8 : System.out.println("EIGHT");
				    break ;
			case 9 : System.out.println("NINE");
				    break ;
			default : System.out.println("OTHER");
		
		}
	}
}
public class PrintNumberInWord {
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
