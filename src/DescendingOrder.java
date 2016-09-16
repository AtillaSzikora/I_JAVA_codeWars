import java.util.Arrays;
import java.util.Collections;

class DescendingOrder {
    static int sortDesc(final int num) {
        String[] resultArray = String.valueOf(num).split("");

        Arrays.sort(resultArray);
        Collections.reverse(Arrays.asList(resultArray));
        String resultString = Arrays.toString(resultArray).replaceAll("\\[|\\]|,| ", "");

        return Integer.parseInt(resultString);
    }
}