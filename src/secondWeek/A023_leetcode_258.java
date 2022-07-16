package secondWeek;

public class A023_leetcode_258 {
//class Solution {
    public int addDigits(int num) {

    	while(Integer.toString(num).length()!=1){
            int output=0;
            String[] str = Integer.toString(num).split("");
            for(int i=0;i<str.length;i++){
                output += Integer.parseInt(str[i]);
            }
            num = output;
        }
        return num;
    }
}