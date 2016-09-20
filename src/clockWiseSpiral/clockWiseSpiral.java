package clockWiseSpiral;

import java.util.Arrays;

public class clockWiseSpiral {
    public static void main(String[] args) {
        createSpiral(5);
    }

    private static int[][] createSpiral(int sideLength) {
        int[] startList = new int[sideLength * sideLength];
        int[][] resultArray = new int[sideLength][sideLength];

        for (int i = 0; i < sideLength * sideLength; i++) {
            startList[i] = i + 1;
        }
        System.out.println(Arrays.toString(startList));

        resultArray[0] = Arrays.copyOfRange(startList, 0, sideLength);
        resultArray[sideLength - 1][sideLength - 1] = sideLength * 2 - 1;

        for (int i = sideLength + 1, j = 1; i < sideLength * 2 - 1; i++, j++) {
            resultArray[j][sideLength - 1] = i;
        }

        for (int i = sideLength * 2, j = sideLength - 2; i <= sideLength * 3 - 2; i++, j--) {
            resultArray[sideLength - 1][j] = i;
        }

        for (int i = sideLength * 3 - 1, j = sideLength - 2; i < sideLength * 4 - 3; i++, j--) {
            resultArray[j][0] = i;
        }


        System.out.println("\nresultArray: \n" + Arrays.deepToString(resultArray).replace("], ", "]\n"));
        return resultArray;
    }
}
