

public class Exercise_26 {
	public static void reverse(int[] array) {
			int n=array.length;
			for(int i=0;i<n/2;i++)
			{
				int temp=array[n-i-1];
				array[n-i-1]=array[i];
				array[i]=temp;
			}
		
	}
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		reverse(a);
		
		for(int i:a) System.out.print(i);
		
	}

}
