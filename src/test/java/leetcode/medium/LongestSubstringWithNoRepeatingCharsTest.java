package leetcode.medium;

import leetcode.solutions.medium.LongestSubstringWithNoRepeatingChars;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LongestSubstringWithNoRepeatingCharsTest {

    @Test
    public void longestSubstringNoRepetition1() {
        assertThat(new LongestSubstringWithNoRepeatingChars().lengthOfLongestSubstring("abcabcbb"), equalTo(3));
    }

    @Test
    public void longestSubstringNoRepetition2() {
        assertThat(new LongestSubstringWithNoRepeatingChars().lengthOfLongestSubstring("bbbbb"), equalTo(1));
    }

    @Test
    public void longestSubstringNoRepetition3() {
        assertThat(new LongestSubstringWithNoRepeatingChars().lengthOfLongestSubstring("pwwkew"), equalTo(3));
    }
}
