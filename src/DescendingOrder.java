/*
Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits in descending order.
Descending order means that you take the highest digit and place the next highest digit immediately after it.
Examples: Input: 145263 Output: 654321, Input: 1254859723 Output: 9875543221
*/

import java.util.ArrayList;
import java.util.Collections;

class DescendingOrder {
    static int sortDesc(final int num) {
        String stringNum = Integer.toString(num);
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < stringNum.length(); i++) {
            resultList.add(Integer.parseInt(String.valueOf(stringNum.charAt(i))));
        }
        Collections.sort(resultList);
        Collections.reverse(resultList);
        stringNum = resultList.toString().replaceAll("\\[|\\]|,| ", "");

        return Integer.parseInt(stringNum);
    }
}
