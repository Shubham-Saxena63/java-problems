package leetcode.solutions.medium;

//--------------------------------------------Problem Description--------------------------------------------//
//Given a string s, return the longest palindromic substring in s.
//
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//        Example 2:
//
//Input: s = "cbbd"
//Output: "bb"
//
//
//Constraints:
//
//        1 <= s.length <= 1000
//s consist of only digits and English letters.
public class Problem5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longestPalindromicSubstring = String.valueOf(s.charAt(0));
        if (s.length() == 1 || (s.length() == 2 && s.equals(new StringBuilder(s).reverse().toString()))){
            longestPalindromicSubstring = s;
        } else {
            //for getting the even palindromic substrings
            for (double i = 0.5; i < s.length() - 1; i++){
                if (s.charAt((int) i) == s.charAt(1 + (int) i)){
                    if(getEvenPalindromicStringFromCentre(s, (int) i, 1 + (int) i).length() > longestPalindromicSubstring.length()){
                        longestPalindromicSubstring = getEvenPalindromicStringFromCentre(s, (int) i, 1 + (int) i);
                    }
                }
            }
            //for getting the odd palindromic substrings
            for (int j = 1; j < s.length() - 1; j++){
                if (s.charAt(j-1) == s.charAt(j+1)){//check if the character before and the character after are equal
                    if (getOddPalindromicStringFromCentre(s, j).length() > longestPalindromicSubstring.length()){
                        longestPalindromicSubstring = getOddPalindromicStringFromCentre(s, j);
                    }
                }
            }
        }
        return longestPalindromicSubstring;
    }

    public String getOddPalindromicStringFromCentre(String mainString, int centrePointOfPalindrome){
        String palindrome = null;
        for (int i = centrePointOfPalindrome - 1, j = centrePointOfPalindrome + 1; i >= 0 && j < mainString.length(); i--, j++){
            if (mainString.charAt(i) == mainString.charAt(j)){
                palindrome = mainString.substring(i, j + 1);
            } else {
                break;
            }
        }
        return palindrome;
    }

    public String getEvenPalindromicStringFromCentre(String mainString, int leftCharacterPosition, int rightCharacterPosition){
        String palindrome = null;
        for (int i = leftCharacterPosition, j = rightCharacterPosition; i >= 0 && j < mainString.length(); i--, j++){
            if (mainString.charAt(i) == mainString.charAt(j)){
                palindrome = mainString.substring(i, j + 1);
            } else {
                break;
            }
        }
        return palindrome;
    }
}
