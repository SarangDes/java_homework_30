

public class Exercise_22 {

	public static boolean contains(int[] array, int key) {
		if(0==array.length)return false;
		for(int i=0;i<array.length;i++) {
			if(key==array[i])return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		System.out.println(contains(a,40));
		int []b= {10,20,30,40,50,60,70};
		System.out.println(contains(a,550));
		int []c= {};
		System.out.println(contains(c,40));


	}

}
