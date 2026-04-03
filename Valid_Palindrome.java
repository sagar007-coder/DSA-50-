// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.


public class Valid_Palindrome
{
	public static void main(String[] args) {
	        String s = "A man, a plan, a canal: Panama";
	        
	        boolean res = func(s);
	       System.out.println(res);
	}
	public static boolean func(String s){
	    String c = "";
	    
	    for(int i = 0 ;i<s.length();i++){
	        char ch = s.charAt(i);
	        if(Character.isLetterOrDigit(ch)){
	            c = c + ch;
	        }
	    }
	    String n = c.toLowerCase();
	    int a = 0;
	    int b = n.length()-1;
	   
	    while(a<b){
	        if(n.charAt(a)!=n.charAt(b)){
	            return false;
	        }
	        a++;
	        b--;
	    }
	    return true;
	}
}