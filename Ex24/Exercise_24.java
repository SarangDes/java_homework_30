
public class Exercise_24 {

	public static boolean equals (int[] array1, int []array2) {
		if(array2.length!=array1.length) return false;
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]!=array2[i])return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int []a1= {10,20,30,40,50,60,70};
		int []a2= {10,20,30,40,50,60,70};
		System.out.println(equals(a1,a2));
		int []b1= {10,20,30,40,50,60,70};
		int []b2= {10,20,30,40,50,60,70,80,90};
		System.out.println(equals(b1,b2));
		int []c1= {};
		int []c2= {};
		System.out.println(equals(c1,c2));


	}

}
