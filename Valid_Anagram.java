// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:
// Input: s = "rat", t = "car"
// Output: false

import java.util.*;
public class Valid_Anagram
{
	public static void main(String[] args) {
	    
	// int[] myIntArray = {1,2,3,4};
	String t = "anagram";
	String s ="nagaram";
	 
 boolean res = twoSum(t,s);
  
  System.out.println(res);
	}
	    
    public static boolean twoSum(String t , String s) {
	HashMap<Character , Integer> map = new HashMap<>();
	if(t.length()!=s.length())
	 return false;
	
	for(int i = 0;i<t.length();i++){
	
	       char ch = t.charAt(i);
	        map.put(ch,map.getOrDefault(ch,0)+1);
	        
	    
	    
	}
		for(int i = 0;i<s.length();i++){
		    char c = s.charAt(i);
	    if(map.containsKey(c)){
	        map.put(c, map.get(c) - 1);
	    }
	    else {
	        return false;
	    }
	    if(map.get(c)<0)
	    return false;
	    
	}
	return true;
	
	
}}