
// Leetcode Question 7
//   Here is the link to the question: https://leetcode.com/problems/reverse-integer/description/

class Solution {
    public int reverse(int x) {
        
        // creating a new variable named ans
        int ans = 0;
        // using while loop to itterate through x
        while(x != 0){
            // diving number by 10 and storing the remainder in a variable.
            // Number will still remain same. No ammendments because change was on new variable
            int num = x%10;

            // putting restrictions to stay in integer range.
            // As we see ans is getting multiplied by 10 so if max integer range comes it will be multiplied by 10 and
            // will be out of bound. Hence we check by dividing it with 10
            if(ans < (Integer.MIN_VALUE/10) || ans > (Integer.MAX_VALUE/10)){
                return 0;
            }

            // adding the variable(num) to ans.
            ans = (ans*10) + num;

            // Dividing x by 10 which will eliminate last digit. 
            // E.g. 121 / 10 = 12 so, x is now 12
            x = (int)x / 10;
            
        }
        
        return ans;
    }
}
