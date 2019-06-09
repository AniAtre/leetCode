package strings;
/**
* Problem Statement:
* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
* Note: For the purpose of this problem, we define empty string as valid palindrome.
*
* Example 1:
* Input: "A man, a plan, a canal: Panama"
* Output: true
*
* Example 2:
* Input: "race a car"
* Output: false
* */
public class IsPalindrome{
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean isValidCharI = false, isValidCharJ = false;
        for(int i = 0, j = s.length()-1; i < j;){
            isValidCharI = Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i));
            isValidCharJ = Character.isDigit(s.charAt(j)) || Character.isLetter(s.charAt(j));
            if(isValidCharI && isValidCharJ){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            if(!isValidCharI){
                i++;
            }
            if(!isValidCharJ){
                j--;
            }
        }
        return true;
    }
}