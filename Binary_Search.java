// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4

public class Binary_Search
{
	public static void main(String[] args) {
		int nums[] = {-1,0,3,5,9,12};int target = 9;
		int res = funx(nums , target);
		System.out.println(res);
	}
	public static int funx(int nums[], int target){
	    int l = 0; 
	    int r =nums.length -1;
	   int mid = 0;
	   while(l<=r){
	       mid = (l+r)/2;
	       if(nums[mid]<target){
	           l = mid +1;
	           
	       }
	       else if (nums[mid]>target){
	           r = mid-1;
	       }
	       else {
	           return mid;
	       }
	   }
	   return -1;
	    }
}