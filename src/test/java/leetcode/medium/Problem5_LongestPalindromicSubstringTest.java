package leetcode.medium;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Problem5_LongestPalindromicSubstringTest {

    @Test
    public void longestPalindromicSubstring1() {
        MatcherAssert.assertThat(new leetcode.solutions.medium.Problem5_LongestPalindromicSubstring().longestPalindrome("babad"), equalTo("bab"));
    }

    @Test
    public void longestPalindromicSubstring2() {
        MatcherAssert.assertThat(new leetcode.solutions.medium.Problem5_LongestPalindromicSubstring().longestPalindrome("bbbbb"), equalTo("bb"));
    }

}
