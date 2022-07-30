package fourthweek;

public class A092_leetcode_922 {

//class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int ans_odd = 1, ans_even=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[ans_even] = nums[i];
                ans_even+=2;
            }else{
                ans[ans_odd] = nums[i];
                ans_odd+=2;
            }
        }
        return ans;
    }
}