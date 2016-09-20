package diamond;

import java.util.Arrays;

class Diamond {
    static String print(int starsInMiddle) {
        StringBuilder resultString = new StringBuilder();
        int spacesInRow = starsInMiddle / 2;
        int starsInRow = 1;
        char[] array;

        for (int cycles = 1; cycles <= starsInMiddle; cycles++) {
            array = new char[spacesInRow];
            Arrays.fill(array, ' ');
            resultString.append(array);
            array = new char[starsInRow];
            Arrays.fill(array, '*');
            resultString.append(array).append('\n');

            if (cycles <= starsInMiddle / 2) {
                spacesInRow--;
                starsInRow += 2;
            } else {
                spacesInRow++;
                starsInRow -= 2;
            }
        }
        if (starsInMiddle % 2 != 1) { return null; }
        return resultString.toString();
    }
}
