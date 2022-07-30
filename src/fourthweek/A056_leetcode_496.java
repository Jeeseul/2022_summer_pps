package fourthweek;

import java.util.Arrays;
public class A056_leetcode_496 {
//class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index=0;
            for(int k=0;k<nums2.length;k++){
                if(nums1[i]==nums2[k]){
                    index=k;
                    break;
                }
            }
            int max=-1;
            for(int j=index;j<nums2.length;j++){
                if(nums2[j]>nums2[index]){ 
                    max=nums2[j];
                    break;
                }
            }
            result[i]=max;
        }
        return result;
    }
}