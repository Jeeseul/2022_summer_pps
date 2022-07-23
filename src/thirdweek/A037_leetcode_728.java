package thirdweek;

import java.util.ArrayList;
import java.util.List;

public class A037_leetcode_728 {
//class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();
        for(int i=left;i<=right;i++){
            String temp = Integer.toString(i);
            String[] sp = temp.split("");
            for(int j=0;j<sp.length;j++){
                int num = Integer.parseInt(sp[j]);
                if(num == 0){
                    break;
                }else if(i%num==0){
                    if(j==sp.length-1) answer.add(i);
                }else break;
            }
            
        }
        return answer;
    }
}