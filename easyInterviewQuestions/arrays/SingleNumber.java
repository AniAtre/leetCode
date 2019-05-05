/**
* Problem Statement:
* Given a non-empty array of integers, every element appears twice except for one. Find that single one.
*
* Note:
* Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*
* Example 1:
* Input: [2,2,1]
* Output: 1
*
* Example 2:
* Input: [4,1,2,1,2]
* Output: 4
* */
import java.util.Arrays;

public class SingleNumber{

    public int singleNumber(int[] nums) {
        // error case
        if(nums == null || nums.length == 0 ){
            return -1;
        }
        // single case
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i = 1; i < nums.length -1; i++){
            if(nums[i] != nums[i + 1] && nums[i] != nums[i-1]){
                return nums[i];
            }
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length - 1] != nums[nums.length -2]){
            return nums[nums.length -1];
        }
        return -1;
    }
}