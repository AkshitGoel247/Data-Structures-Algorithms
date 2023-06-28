
// Leetcode Question 7
//   Here is the link to the question https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        
        // converting int to string
        String str = String.valueOf(x);
        // length of string
        int len = str.length();
        // loop to check whether palindrome or not
        for(int i=0; i<len/2; i++){

            // if characters from both sides are not same, return false
            if(str.charAt(i) != str.charAt(len-1-i)){
                return false;
            }
        }
        // return true if all conditions met
        return true;
    }
}
