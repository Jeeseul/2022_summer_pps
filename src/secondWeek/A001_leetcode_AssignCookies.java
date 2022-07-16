package secondWeek;

import java.util.Arrays;

public class A001_leetcode_AssignCookies {
//class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);//g=애들 배고픔 지수
        Arrays.sort(s);//s=쿠키 크기
        int count=0;
        if(s.length == 0)return 0;
        for(int i=s.length-1;i>=0;i--){
            for(int j=g.length-1;j>=0;j--){
                if(g[j]==0||s[i]<g[j])continue;
                else {
                    g[j] = 0;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}