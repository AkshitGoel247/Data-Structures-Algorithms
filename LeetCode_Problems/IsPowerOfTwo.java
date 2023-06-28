
// Leetcode Question 231
//   Here is the link to the question: https://leetcode.com/problems/power-of-two/description/

class Solution {
    public boolean isPowerOfTwo(int n) {

      // ------------------ Method 1 ------------------
        // if number is 1, return true
        if(n == 1){
            return true;
        }
        // declaring variable ans
        int ans = 1;
        // itterating upto 31 bcs range of integers is 2^31
        for(int i=0; i<31; i++){
            if(ans == n){
                return true;
            }
            // all numbers in 2's power
            ans = ans * 2;
        }
        return false;
    }


    // // ------------------ METHOD 2 USING RECURSION ---------------------
    //    if (n==1) then 2^0 so, true
    //     if(n == 1){
    //         return true;
    //     }
    //     // cases where not a power
    //     if((n <= 0) || (n % 2 != 0)){
    //         return false;
    //     }
    //     // using Recursion
    //     return isPowerOfTwo(n/2);
}
