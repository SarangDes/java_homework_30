
public class Exercise_27 {
	public static boolean swap(int[] array1, int []array2) {
		if(array2.length!=array1.length) {return false;}
		
			
			for(int i=0;i<array1.length;i++)
			{
				int temp=array1[i];
				array1[i]=array2[i];
				array2[i]=temp;
			}
	
				return false;
	}
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		int []b= {70,60,50,40,30,20,10};
		
		System.out.println(swap(a,b));
		int []a1= {10,20,30,40,50,60,70};
		int []b1= {70,60,30,20,10};
		System.out.println(swap(a1,b1));
		int []a2= {};
		int []b2= {};

		System.out.println(swap(a2,b2));
	}
		
}
