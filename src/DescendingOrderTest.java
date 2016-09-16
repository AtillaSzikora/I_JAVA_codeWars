/*
Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits in descending order.
Descending order means that you take the highest digit and place the next highest digit immediately after it.
Examples: Input: 145263 Output: 654321, Input: 1254859723 Output: 9875543221
*/

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}