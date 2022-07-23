package thirdweek;

public class A120_leetcode_389 {

//class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0) return t.charAt(0);
        for(int i=0;i<s.length();i++){
            if(t.contains(Character.toString(s.charAt(i)))){
             t = t.replaceFirst(Character.toString(s.charAt(i)),""); 
            }
        }
        return t.charAt(0);
    }
}