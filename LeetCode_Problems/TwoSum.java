
// Leetcode Question 1
// Here is the link to the question https://leetcode.com/problems/two-sum/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i=0; 
        int[] ans =  {0,0};
        while(i < nums.length){
            int j = i+1;
            while(j < nums.length){
                int sum = nums[i] + nums[j];
                if(sum != target){
                    j++;
                }
                else{
                    return new int[] {i,j};
                }
            }
            i++;
        }
        return ans;
    }
}
