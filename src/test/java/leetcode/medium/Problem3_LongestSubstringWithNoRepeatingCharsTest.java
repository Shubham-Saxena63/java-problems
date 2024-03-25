package leetcode.medium;

import leetcode.solutions.medium.Problem3_LongestSubstringWithNoRepeatingChars;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Problem3_LongestSubstringWithNoRepeatingCharsTest {

    @Test
    public void longestSubstringNoRepetition1() {
        assertThat(new Problem3_LongestSubstringWithNoRepeatingChars().lengthOfLongestSubstring("abcabcbb"), equalTo(3));
    }

    @Test
    public void longestSubstringNoRepetition2() {
        assertThat(new Problem3_LongestSubstringWithNoRepeatingChars().lengthOfLongestSubstring("bbbbb"), equalTo(1));
    }

    @Test
    public void longestSubstringNoRepetition3() {
        assertThat(new Problem3_LongestSubstringWithNoRepeatingChars().lengthOfLongestSubstring("pwwkew"), equalTo(3));
    }
}
