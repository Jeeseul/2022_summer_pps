package secondWeek;

public class A003_leetcode_plusOne66 {
//class Solution {
    public int[] plusOne(int[] digits) {
        boolean pass = false;
        int i=digits.length-1;
        int[] spare = new int[digits.length+1];
        
        while(pass == false){
            if(i<0){
                spare[0] = 1;
                for(int j=1;j<spare.length;j++){
                    spare[j] = digits[j-1];
                }
                return spare;
            }else if( digits[i]+1 != 10){
                digits[i]++;
                pass = true;                
            }
            else{
                digits[i] = 0;
                i--;
            }
        }
        return digits;
    }
}