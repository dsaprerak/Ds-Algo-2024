import java.util.HashSet;
import java.util.SortedSet;

public class Problem2 {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 89,16, 5,3, 56, 86, 999, 5 };
		// System.out.println(arr);
		largest(arr, 6);

	}

	public static void largest(int[] arr, int x) { // for sorting
		HashSet<Integer> sset = new HashSet<Integer>();

	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length ; j++) {			
				if (arr[i] < arr[j]) {
					int rep = arr[i];
					arr[i] = arr[j];
					arr[j] = rep;
				}
			}
		}
		
		System.out.println(x + "largets element is :" + arr[x]);
		

//		for (int i = 0; i < arr.length; i++) {
//			sset.add(arr[i]);
//		}
//		
//		for (int  i : sset) 
//			System.out.println(i);

//		for (int  i : sset) {
//			System.out.println(i);
//			int count = 0;
//			count++;
//			if (x == count) {
//				System.out.println(x + "largets element is :" + i);
//			}
//		}
		// return i;
	}
}
