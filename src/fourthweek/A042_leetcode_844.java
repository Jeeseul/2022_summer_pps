package fourthweek;

import java.util.Stack;
import java.lang.Math;

public class A042_leetcode_844 {
//class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> tt = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#' && ss.empty());
            else if(s.charAt(i) == '#') ss.pop();
            else ss.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#' && tt.empty());
            else if(t.charAt(i) == '#') tt.pop();
            else tt.push(t.charAt(i));
        }
        int max = Math.max(s.length(),t.length());
        for(int i=0;i<max;i++){
            if((ss.empty()&&!tt.empty())||(!ss.empty()&&tt.empty())) return false;
            else if(ss.empty()&&tt.empty()) return true;
            else{
                if(ss.pop()==tt.pop()) continue;
                else return false;
            }
        }
        return true;
    }
}