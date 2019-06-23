package arrays;
/**
* Problem Statement:
* Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
* The digits are stored such that the most significant digit is at the head of the list, and
* each element in the array contain a single digit.
* You may assume the integer does not contain any leading zero, except the number 0 itself.
*
* Example 1:
* Input: [1,2,3]
* Output: [1,2,4]
* Explanation: The array represents the integer 123.
*
* Example 2:
* Input: [4,3,2,1]
* Output: [4,3,2,2]
* Explanation: The array represents the integer 4321.
* */

import java.util.List;
import java.util.ArrayList;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> sum = new ArrayList<Integer>();
        int [] result;
        int carry = 1;
        boolean addCarryFlag = false;
        for(int i = digits.length - 1; i >= 0; i--){
            carry = digits[i] + carry;
            if(carry > 9){
                sum.add(carry%10);
                carry = carry / 10;
                addCarryFlag = true;
            }else{
                sum.add(carry);
                carry = 0;
                addCarryFlag = false;
            }
        }
        if(addCarryFlag){
            sum.add(carry);
        }
        result = new int[sum.size()];
        for(int i = 0, j = sum.size()-1; j >= 0; j--,i++){
            result[i] = sum.get(j);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("");
    }

}
