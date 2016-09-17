import java.util.Arrays;

class Diamond {
    static String print(int width) {
        StringBuilder resultString = new StringBuilder();
        int starsInRow = 1, spacesInRow = width / 2;
        char[] array;

        for (int cycles = 1; cycles < width + 1; cycles++) {
            array = new char[spacesInRow];
            Arrays.fill(array, ' ');
            resultString.append(array);
            array = new char[starsInRow];
            Arrays.fill(array, '*');
            resultString.append(array).append('\n');

            if (cycles < width / 2 + 1) { starsInRow += 2; spacesInRow--; }
            if (cycles >= width / 2 + 1) { starsInRow -= 2; spacesInRow++; }
        }
        return resultString.toString();
    }
}
