// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

import java.util.*;
public class Two_Sum
{
	public static void main(String[] args) {
	    
	 int[] myIntArray = {3,2,4};
	 int target  = 6;
  int[] res = twoSum(myIntArray , target);
  
  System.out.println(java.util.Arrays.toString(res));
	}
	    
    public static int[] twoSum(int[] nums, int target) {
	 int arr[]= new int[2];
	 HashMap<Integer,Integer>  map = new HashMap<>();
	 for(int i = 0 ;i<nums.length;i++){
	     int x = target-nums[i];
	     if(map.containsKey(x)){
	         arr[1] = i;
	         arr[0] = map.get(x);
	         return arr;
	         
	     }
	     else {
	         map.put(nums[i],i);
	     }
	 }return arr;
}}