Q. Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
  If target exists, then return its index. Otherwise, return -1.
  You must write an algorithm with O(log n) runtime complexity.


Soln: Binary Search Approach:

class Solution {
    public int search(int[] nums, int target) {
        int s = nums.length;
        int left = 0, right = s-1, pivot;
        while(left <= right){
            pivot = left + (right - left)/2; //pivot is the middle element index
            if(nums[pivot] == target)
                return pivot;
            
            if(target < nums[pivot])
                right = pivot - 1;
            
            else
                left  = pivot + 1;
        }
        return -1;    
    }
}
