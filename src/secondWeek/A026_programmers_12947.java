package secondWeek;

public class A026_programmers_12947 {

//class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] input = Integer.toString(x).split("");
        int sum=0;
        for(int i=0;i<input.length;i++){
         sum += Integer.parseInt(input[i]);   
        }
        if(x%sum!=0) answer = false;
        return answer;
    }
}