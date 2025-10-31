import java.util.Scanner;

public class PhoneKeyPad {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ente the string :");
		String str = s.nextLine().toLowerCase();
		long n=0;
		for (int i= 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='b'||ch=='c') n=n*10+2;
			else if (ch=='d'||ch=='e'||ch=='f') n=n*10+3;
			else if (ch=='g'||ch=='h'||ch=='i') n=n*10+4;
			else if (ch=='j'||ch=='k'||ch=='l') n=n*10+5;
			else if (ch=='m'||ch=='n'||ch=='o') n=n*10+6;
			else if (ch=='p'||ch=='s'||ch=='q'||ch=='r') n=n*10+7;
			else if (ch=='t'||ch=='u'||ch=='v') n=n*10+8;
			else if (ch=='w'||ch=='y'||ch=='x'||ch=='z') n=n*10+9;
			else continue;
		}
		System.out.println(n);
	}

}
