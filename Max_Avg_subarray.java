// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

public class Max_Avg_subarray {
    public static double findMaxAverage(int[] nums, int k) {
     int sum  = 0;
     int maxi = Integer.MIN_VALUE;
     
      for( int right = 0;right<k;right++){
        sum+= nums[right];
        }  

        maxi = sum; 
        for(int i = k ;i<nums.length;i++){
            sum -= nums[i - k] ;
            sum+= nums[i];                   
            maxi = Math.max(maxi,sum);
        
        }
        return (double)maxi/k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}

