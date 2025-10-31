

public class Exercise_23 {

	public static int search(int[] array, int key) {
		if(0==array.length)return -1;
		for(int i=0;i<array.length;i++) {
			if(key==array[i])return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		System.out.println(search(a,40));
		int []b= {10,20,30,40,50,60,70};
		System.out.println(search(a,550));
		int []c= {};
		System.out.println(search(c,40));


	}

}
