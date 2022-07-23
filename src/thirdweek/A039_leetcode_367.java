package thirdweek;

public class A039_leetcode_367 {

//class Solution {
    public boolean isPerfectSquare(int num) {
        long high = num;
        long low=1;
        long mid=0;
        if(num==1) return true;
        while(low<=high){
            mid = (low+high)/2;
            if(mid*mid == num) return true;
            else if(mid*mid>num) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}