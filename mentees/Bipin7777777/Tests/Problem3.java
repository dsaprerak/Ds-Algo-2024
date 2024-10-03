import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    static HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		Integer[] arr= {1,23,1,5,9,7,5,9,9,9,9};	
		count(arr);
		
//		hmap.put(22,23);
//		hmap.put(2324, 23424);
//		
//		System.out.println("value is"+hmap.get(22));
		
		for( Map.Entry<Integer,Integer> e : hmap.entrySet() ){
			System.out.println(e.getKey()+"="+e.getValue());
		}
	   }
	
	public static HashMap<Integer,Integer> count(Integer[] arr){
		
		for (int i=0;i < arr.length; i++) {
			if(hmap.containsKey(arr[i])) {
		//		System.out.println("present");
			Integer x=hmap.get(arr[i]);
			hmap.put( arr[i] , x+1 );
		//	System.out.println("incremented");
			}
			else {
				hmap.put(arr[i], 1);
		//	System.out.println("added");
			}
			
		}
		
//		while(arr[i] < arr.length) {
//			if(hmap.containsKey(arr[i])) {
//				System.out.println("entered");
//				Integer x=hmap.get(arr[i]);
//				hmap.put( arr[i] , x+1 );
//			}
//			else
//			{
//				hmap.put(arr[i], 1);
//			}
//			
//			i++;
//		}
		
		return hmap;
	}

}
