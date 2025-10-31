

public class Exercise_25 {
	public static int [] copyOf (int[] array) {return array;}
	
	public static int[] copyOf (int[] array, int newlength) {
		if(newlength==array.length) {return array;}
		if(newlength<array.length) {
			int []copy=new int[newlength];
			for(int i=0;i<newlength;i++)
			{
				copy[i]=array[i];
			}
			return copy;
		}else {
			int []copy=new int[newlength];
			for(int i=0;i<array.length;i++)
			{
				copy[i]=array[i];
			}
			for(int i=array.length;i<newlength;i++)
			{
				copy[i]=0;
			}
			return copy;
		}
				
	}
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};

		for(int i:copyOf(a)) System.out.print(i);
		System.out.println();
		for(int i:copyOf(a,5))System.out.print(i);
		System.out.println();
		for(int i:copyOf(a,3))System.out.print(i);
		System.out.println();
		for(int i:copyOf(a,0))System.out.print(i);
		


	}

}
