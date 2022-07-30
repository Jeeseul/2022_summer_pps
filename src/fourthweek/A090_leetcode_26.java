package fourthweek;

public class A090_leetcode_26 {

//class Solution {
    public int removeDuplicates(int[] nums) {
        int now = nums[0];
        int top = 1;
        for(int i=0;i<nums.length;i++){
            if(now == nums[i]) continue;
            else {
                nums[top] = nums[i];
                now = nums[top];
                top++;
            }
        }
        return top;
    }
}