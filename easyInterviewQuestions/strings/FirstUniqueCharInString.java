package strings;
/**
* Problem Statement:
* Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
* Examples:
* s = "leetcode"
* return 0.
*
* s = "loveleetcode",
* return 2
* Note: You may assume the string contain only lowercase letters.
* */

public class FirstUniqueCharInString{
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}