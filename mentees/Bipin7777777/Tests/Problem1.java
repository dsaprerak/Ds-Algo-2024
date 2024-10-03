

public class Problem1 {
    //public static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
    public static void main(String[] args) {
		System.out.println("nos of ways will be :"+climb(5) );

	}

	
	public static int  climb(int n) {
	  int x=1;  // default for climbing 1 stairs at a time
	  
	   if(n%2==0)
	   {
		   x++; // for climbing 2 steps at a time
		   
	   }
	   else {
		   x= x+n;   //for n nos of places can be 1st step and rest will be 2nd step
	   }

		return x;
	}
}
