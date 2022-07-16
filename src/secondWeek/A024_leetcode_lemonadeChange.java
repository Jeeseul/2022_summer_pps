package secondWeek;

public class A024_leetcode_lemonadeChange {
//class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] remain= {0,0,0};
        if(bills[0]!=5) return false;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                remain[0]++;
            }else if(bills[i]==10){
                remain[1]++;
                if(remain[0]<1) return false;
                remain[0]--;
            }else{
                remain[2]++;

                if(remain[1]>0){
                    if(remain[0]>0){
                        remain[0]--;
                        remain[1]--;
                    }else return false;
                }else if(remain[0]>=3){
                    remain[0]-=3;
                }else return false;
                
            }
        }
        return true;
    }
}