// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
// Example 1:
// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Example 2:
// Input: nums = [1], k = 1
// Output: [1]

import java.util.*;
public class TopK_FrequentElements
{
	public static void main(String[] args) {
	    
	 int[] arr = {1,1,1,2,2,3};
	 int k  = 2;

 int[]res = twoSum(arr,k);
  
  System.out.println(java.util.Arrays.toString(res));
	}
	    
    public static int[] twoSum(int [] t, int k ) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i<t.length;i++){
          
                map.put(t[i],map.getOrDefault(t[i],0)+1);
                
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (n1, n2) -> map.get(n1) - map.get(n2));
           for(int n : map.keySet()){
            maxHeap.add(n);
            if(maxHeap.size()>2){
                maxHeap.poll();
            }
        }
        int l = maxHeap.size();
        int arr [] = new int[l];
        for(int i =k-1;i>=0;--i){
            arr[i] = maxHeap.poll();
        }
        
        return arr;
        

        }
        
        
}