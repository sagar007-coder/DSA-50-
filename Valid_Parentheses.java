import java.util.*;
public class Valid_Parentheses
{
	public static void main(String[] args) {
	    String s = "(())";
	    boolean res = isValid(s);
	    System.out.println(res);
	}
	public static boolean isValid(String str){
	    
	    Stack<Character> st = new Stack<>();
	    for(Character ch : str.toCharArray()){
	        if(ch=='('|| ch == '{' || ch == '['){
	            st.push(ch);
	            
	        }else{
	            if(st.isEmpty()){
	            return false;}
	            else{
	              char it = st.pop();
	               if((ch == ')' && it == '(') ||( ch == '}' && it == '{' )||(ch == ']' && it == '[')){
	                   continue;}
	               else
	               return false;
	               
	            }
	        }
	    }
	    return st.isEmpty();
	}
}