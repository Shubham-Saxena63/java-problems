package leetcode.solutions.medium;

import java.util.LinkedList;
import java.util.List;

//--------------------------------------------Problem Description--------------------------------------------//
//Given a string s, find the length of the longest substring without repeating characters.
//
//Example 1:
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//
//Example 2:
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//
//Example 3:
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//Constraints:
//
//0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.


public class Problem3_LongestSubstringWithNoRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int numberOfCharsInTheLongestNonRepeatingSubstring = 0;
        for (int i = 0; i < chars.length; i++){
            List<Character> listOfNonRepeatingChars = new LinkedList<>();
            listOfNonRepeatingChars.add(chars[i]);
            for (int j = i + 1; j < chars.length; j++){
                if(!listOfNonRepeatingChars.contains(chars[j])){
                    listOfNonRepeatingChars.add(chars[j]);
                } else {
                    break;
                }
            }
            if (listOfNonRepeatingChars.size() > numberOfCharsInTheLongestNonRepeatingSubstring){
                numberOfCharsInTheLongestNonRepeatingSubstring = listOfNonRepeatingChars.size();
            }
        }
        return numberOfCharsInTheLongestNonRepeatingSubstring;
    }
}
