// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.

import java.util.*;
public class Contains_Duplicate
{
	public static void main(String[] args) {
	    
	 int[] myIntArray = {1,2,3,1};
	 
 boolean res = twoSum(myIntArray);
  
  System.out.println(res);
	}
	    
    public static boolean twoSum(int[] nums) {
	 
	 HashSet<Integer> set = new HashSet<>();
	 for(int i = 0 ;i<nums.length;i++){
	     if(!set.contains(nums[i])){
	         set.add(nums[i]);
	     }
	     else {
	        return true;
	     }
	 }return false;
}}