package diamond;/*
You need to a string that when printed, displays a diamond shape on the screen using asterisk ("*") characters.
Please see provided test cases for exact output format.
The shape that will be returned from print method resembles a diamond, where the number provided as input
represents the number of *’s printed on the middle line. The line above and below will be centered
and will have 2 less *’s than the middle line. This reduction by 2 *’s for each line continues until
a line with a single * is printed at the top and bottom of the figure.
Return null if input is even number or negative (as it is not possible to print diamond with even number or negative number).
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DiamondTest {
    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), Diamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), Diamond.print(5));
    }

    @Test
    public void testDiamond7() {
        StringBuffer expected = new StringBuffer();
        expected.append("   *\n");
        expected.append("  ***\n");
        expected.append(" *****\n");
        expected.append("*******\n");
        expected.append(" *****\n");
        expected.append("  ***\n");
        expected.append("   *\n");

        assertEquals(expected.toString(), Diamond.print(7));
    }
}
