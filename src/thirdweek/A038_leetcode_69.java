package thirdweek;

public class A038_leetcode_69 {
//class Solution {
    public int mySqrt(int x) {
        long ans = 1;
     
        while (ans * ans <= x) {
            ++ans;
        }
        
        return (int) ans - 1;
    }
}