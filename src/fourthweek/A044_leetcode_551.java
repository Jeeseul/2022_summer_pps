package fourthweek;

public class A044_leetcode_551 {

//class Solution {
    public boolean checkRecord(String s) {
        int A_count=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') A_count++;
            else if(s.charAt(i)=='L') {
                if(i>1&&s.charAt(i-1)=='L'&&s.charAt(i-2)=='L') return false;
            }else continue;
        }
        if(A_count>1) return false;
        else return true;
    }
}