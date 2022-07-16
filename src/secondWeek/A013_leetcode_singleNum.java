package secondWeek;

import java.util.Arrays;

public class A013_leetcode_singleNum {
	    public int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        
	        int single=0;
	        int temp=nums[0];
	        
	        for(int i=0;i<nums.length;i+=2){
	            if(temp != nums[i]) temp = nums[i];
	            if((i+1)<nums.length){
	                if(nums[i] == nums[i+1]) continue;
	                else {
	                    single = nums[i];
	                    break;
	                }
	            }else if(single != temp)single = temp;
	        }
	        return single;
	    }
	}

