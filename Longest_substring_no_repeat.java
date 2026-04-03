// Given a string s, find the length of the longest substring without duplicate characters.
// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

import java.util.*;
public class Longest_substring_no_repeat
{
	public static void main(String[] args) {
		String str  = "abba";
		int res = funx(str);
		System.out.println(res);
	}
	public static int funx(String str){
	    int i = 0; int maxi =0;
	    HashSet<Character> set = new HashSet<>();
	    for(int right = 0;right<str.length();right++){
	        char ch = str.charAt(right);
	        
	        while(set.contains(ch)){
	            set.remove(str.charAt(i));
	            i++;
	        }
	        set.add(ch);
	        maxi = Math.max(maxi, right-i +1);
	    }
	  
	       
	        
	    
	    return maxi;
	   
	}
	
}