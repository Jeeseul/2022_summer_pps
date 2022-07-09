package firstWeek;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count=0;
        for(int num:arr){
            if(num%divisor==0) count++;
            else continue;
        }
        
        if(count ==0 ) {
            answer = new int[1];
            answer[0] = -1;
        }else if(count>0) {
            answer = new int[count];
            count=0;
            for(int num:arr){
                if(num%divisor==0) answer[count++] = num;
                else continue;
            }
            Arrays.sort(answer);
        }
        
        return answer;
    }
}
