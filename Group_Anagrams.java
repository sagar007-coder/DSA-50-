// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
// Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

import java.util.*;
public class Group_Anagrams
{
	public static void main(String[] args) {
		// int[] myIntArray = {1,2,3,4};
	String t[] = {"eat","tea","tan","ate","nat","bat"};
	
 List<List<String>> res = twoSum(t);
  
  System.out.println(res);
	}
	    
    public static List<List<String>> twoSum(String[] t ) {
        HashMap<String, List<String>> map = new HashMap<>();
        int len = t.length;
        for(int i = 0 ;i<len;i++){
            String rev = t[i];
            char[] chars = rev.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            if(!map.containsKey(sortedS)){
             map.put(sortedS,new ArrayList<>());

              
            }
              map.get(sortedS).add(rev);
            
        }
        
        return new ArrayList<>(map.values());
	
	
}}