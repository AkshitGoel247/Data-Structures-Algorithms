
// Leetcode Question 11
// Here is the link to the question: https://leetcode.com/problems/container-with-most-water/description/

class Solution {
    public int maxArea(int[] height) {
        
        // making pointers
        int leftPointer = 0;
        int rightPointer = height.length-1;

        // taking initial area 
        int max = (height.length-1)*(Math.min(height[0], height[height.length-1]));

        // while loop to itterate through 
        while(leftPointer < rightPointer){

            // width for area
            int width = rightPointer - leftPointer;
            
            // length for area
            int length = Math.min(height[leftPointer], height[rightPointer]);
            
            //if height of left is less than height of right
            if(height[leftPointer] <= height[rightPointer]){
                leftPointer++;
            }else{
                rightPointer--;
            }

            // area which is length into breadth
            int area = width*length;

            // if curretn area is greater than initial or previous area
            if(area > max){
                max = area;
            }

        }
        return max;
    }
}  
