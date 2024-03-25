package leetcode.easy;


import leetcode.solutions.easy.Problem1_TwoSum;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit test for two sum problem
 */
public class Problem1_TwoSumTest {

    @Test
    void twoSum() {
        assertThat(new Problem1_TwoSum().twoSum(new int[] {2, 7, 11, 15}, 9), equalTo(new int[] {0, 1}));
    }

    @Test
    void twoSum2() {
        assertThat(new Problem1_TwoSum().twoSum(new int[] {3, 2, 4}, 6), equalTo(new int[] {1, 2}));
    }

    @Test
    void twoSum3() {
        assertThat(new Problem1_TwoSum().twoSum(new int[] {3, 3}, 6), equalTo(new int[] {0, 1}));
    }

}
