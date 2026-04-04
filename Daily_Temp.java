import java.util.*;

public class Daily_Temp {
    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
       
        int ans [] = new int [temperatures.length];
        
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i]){
                int prev = st.pop();
                ans[prev] = i-prev;
        }
              st.push(i);
        }

        while(!st.empty()) {
            ans[st.pop()] = 0;
        }
        System.out.println("hey"+Arrays.toString(ans));
    }
}
