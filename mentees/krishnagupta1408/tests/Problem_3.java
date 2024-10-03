Problem 3:-

Given an array of integers. Find the numbers whose occurence in the array is odd. 

Note: Integers are from 0 to 100 and length of array is greater than the max value in Array

For eg: 
Input: [1,3,4,2,4,1,4]

Output: [3,4,2]; Since 3 & 2 is repeated once, 4 is repeated three times.


Solution:

		List<Integer> OddOccurrence(int[] a) {
			Map<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
			List<Integer> result = new ArrayList<>();
			
			for(int i:a) {
				mp.put(i, mp.getOrDefault(i, 0)+1);
			}
			
			//System.out.println(mp);

			for(Integer i:mp.keySet()) {
				if(mp.get(i) % 2 == 1)
					result.add(i);
			}
			return result;
		}
		
