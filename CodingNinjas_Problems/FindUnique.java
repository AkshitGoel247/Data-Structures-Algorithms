
// Coding Ninjas problem - Find Unique
//   Link to the problem - https://www.codingninjas.com/studio/problems/find-unique_625159?

public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here

    // making variable to store answer
      int ans = 0;

      // looping through array 
      for(int i=0; i<arr.length; i++){

        // using XOR functionality wherein if element is XOR by itself,
        // it returns 0 and if XOR by 0, it returns 0
        // Hence, only element with single occurance remains in last
         ans = ans ^ arr[i];
      }
      return ans;
    }
}
