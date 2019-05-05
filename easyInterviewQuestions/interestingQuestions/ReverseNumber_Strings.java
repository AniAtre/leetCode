/**
* Problem Statement:
* Given a 32-bit signed integer, reverse digits of an integer.
*
* Example 1:
* Input: 123
* Output: 321
* Example 2:
*
* Input: -123
* Output: -321
* Example 3:
*
* Input: 120
* Output: 21
*
* Note:
* Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
* [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer
* overflows.
*
* Interesting Test Cases:
*  1. 1534236469
*  2. -110
*  3. 105 
* */

public class ReverseNumber_Strings{
    public int reverse(int x) {
        int result = 0, multiplier = 10, remainder = 0;
        while (x != 0){
            remainder = x %10;
            int newResult = (result * multiplier) + remainder;
            if((newResult - remainder)/multiplier != result){
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result ;
    }
}