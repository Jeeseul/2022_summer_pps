package fourthweek;

import java.util.Arrays;

public class A064_leetcode_1051 {

//class Solution {
    public int heightChecker(int[] heights) {
        int[] sortArr = new int[heights.length];
        int count=0;
        
        for(int i=0;i<heights.length;i++){
            sortArr[i] = heights[i];
        }
        Arrays.sort(sortArr);
        for(int i=0;i<heights.length;i++){
            if(sortArr[i] != heights[i]) count++;
        }
        return count;
    }
}