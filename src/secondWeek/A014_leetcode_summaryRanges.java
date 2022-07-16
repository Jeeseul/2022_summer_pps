package secondWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A014_leetcode_summaryRanges {

//class Solution {
    public List<String> summaryRanges(int[] nums) {
        String[] result = new String[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length==1) result[count]= Integer.toString(nums[i]);
            if(result[count]!=null&&result[count].contains(Integer.toString(nums[nums.length-1]))) break;
            for(int j=1;j<nums.length;j++){
                if(i == nums.length-1&&result[count]==null){
                    result[count]= Integer.toString(nums[i]);
                    break;
                }
                else if(i+j >= nums.length) break;
                 else if(nums[i]+j==nums[i+j]) {
                     result[count]=Integer.toString(nums[i])+"->"+Integer.toString(nums[i+j]);
                    
                 }else {
                     if(result[count]==null) result[count]= Integer.toString(nums[i]);
                     i=i+j-1;
                     count++;
                     break; 
                 }
            }
        }
        List<String> list = new ArrayList<String>();
        for(int i=0;i<result.length;i++){
            if(result[i]!=null)
            list.add(result[i]);            
        }
        return list;
    }
}