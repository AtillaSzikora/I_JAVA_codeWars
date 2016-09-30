package FindDuplicates;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindDuplicateTest {

    @Test
    void test01() {
        int[] testArray = {0, 0, 1, 7, 2, 9, 3, 2, 8, 10, 1, 0, 1, 5, 6, 4, 4};
        int[] resultArray = {0, 0, 1, 2, 2, 1, 0, 1, 4, 4};
        assertEquals(resultArray, FindDuplicates.getDuplicates(testArray));
    }

    @Test
    void test02() {
        int[] testArray = {11, 11, 6, 3, 8, 2, 5, 3, 3, 8, 9, 10, 7, 16, 22, 22};
        int[] resultArray = {11, 11, 3, 8, 3, 3, 8, 22, 22};
        assertEquals(resultArray, FindDuplicates.getDuplicates(testArray));
    }

}
