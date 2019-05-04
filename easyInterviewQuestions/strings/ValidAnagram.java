/*
* Problem Statement:
* Given two strings s and t , write a function to determine if t is an anagram of s.
*
* Example 1:
*
* Input: s = "anagram", t = "nagaram"
* Output: true
* Example 2:
*
* Input: s = "rat", t = "car"
* Ouput: false
* Note:
* You may assume the string contains only lowercase alphabets.
*
* Follow up:
* What if the inputs contain unicode characters? How would you adapt your solution to such case?
* */
import java.util.Arrays;
public class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char [] firstCharArr = s.toLowerCase().toCharArray();
        char [] secondCharArr = t.toLowerCase().toCharArray();
        Arrays.sort(firstCharArr);
        Arrays.sort(secondCharArr);
        return Arrays.equals(firstCharArr, secondCharArr);
    }
}