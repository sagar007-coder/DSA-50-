// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store
// Notice that you may not slant the container.
// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49

public class Container_with_most_water
{
	public static void main(String[] args) {
	        //String s = "A man, a plan, a canal: Panama";
	        int height[] = {1,8,6,2,5,4,8,3,7};
	        
	        int res = func(height);
	       System.out.println(res);
	}
	public static int func(int s[]){
	  int area =1;
	   int i = 0;
	   int j = s.length -1 ;
	   while(i<j){
	       int h = Math.min(s[i],s[j]);
	       int w = j-i;
	       area  = Math.max(area,h*w);
	       i++;
	   }
	   return area;
	}
}