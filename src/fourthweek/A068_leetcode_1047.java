package fourthweek;

import java.util.Stack;

public class A068_leetcode_1047 {
	//class Solution {
    public String removeDuplicates(String s) {
        Stack<String> st = new Stack<>();
        String result="";
        
        for(int i=0;i<s.length();i++){
            String x = Character.toString(s.charAt(i));
            if(i==0) st.push(x);
            else{
                if(!st.empty()&&st.peek().equals(x)) st.pop();
                else st.push(x);
            }
        }
        while(!st.empty()){
            result = st.pop() + result;
        }
        
        return result;
    }
}