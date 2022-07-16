package secondWeek;

import java.lang.Math;

public class A025_leetcode_342 {
//class Solution {
    public boolean isPowerOfFour(int n) {
        double temp=0;
        for(int i=0;temp<n;i++){
            temp = Math.pow(4,i);
            if(temp == n) return true;
        }
        return false;
    }
}