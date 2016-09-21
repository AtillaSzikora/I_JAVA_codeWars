package sodoku;

import java.util.*;

public class SodokuGame {
    static int[][] gameField = new int[][] {
            { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
            { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
            { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
            { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
            { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
            { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
            { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
            { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
            { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

    public static void main(String[] args) {
        System.out.println(isTableValid());
    }

    private static int[] getBlock(int blockRowIndex, int blockColIndex) {
        int[] resultBlock = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultBlock[i * 3 + j] = gameField[blockRowIndex * 3 + i][blockColIndex * 3 + j];
            }
        }
        return resultBlock;
    }

    public static boolean isTableValid() {
        boolean rows = areRowsValid();
        boolean cols = areColumnsValid();
        boolean blocks = areBlocksValid();
        return rows && cols && blocks;
    }

    private static boolean areBlocksValid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] block = getBlock(j, i);
                if (containsDuplicates(block)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean containsDuplicates(int[] array) {
        Integer[] a = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
        Set <Integer> hashSet = new HashSet<Integer>(Arrays.asList(a));
        return hashSet.size() != array.length;
    }

    private static boolean areRowsValid() {
        for (int[] row: gameField) {
            if (containsDuplicates(row)) {
                return false;
            }
        }
        return true;
    }

    private static boolean areColumnsValid() {
        for (int i = 0; i < gameField[0].length; i++) {
            int[] col = getColumn(i);
            if (containsDuplicates(col)) {
                return false;
            }
        }
        return true;
    }

    private static int[] getColumn(int columnIndex) {
        int[] resultColumn = new int[gameField.length];
        for (int i = 0; i < gameField.length; i++) {
            int[] row = gameField[i];
            resultColumn[i] = row[columnIndex];
        }
        return resultColumn;
    }
}
