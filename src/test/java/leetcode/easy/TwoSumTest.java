package leetcode.easy;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit test for two sum problem
 */
public class TwoSumTest {

    @Test
    void twoSum() {
        assertThat(new TwoSum().twoSum(new int[] {2, 7, 11, 15}, 9), equalTo(new int[] {0, 1}));
    }

    @Test
    void twoSum2() {
        assertThat(new TwoSum().twoSum(new int[] {3, 2, 4}, 6), equalTo(new int[] {1, 2}));
    }

    @Test
    void twoSum3() {
        assertThat(new TwoSum().twoSum(new int[] {3, 3}, 6), equalTo(new int[] {0, 1}));
    }

}
