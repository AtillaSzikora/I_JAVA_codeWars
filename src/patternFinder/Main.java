package patternFinder;

public class Main {

    public static void main(String[] args) {
//        int [] numbersArray = new int[] {1, 2, 3, 4, 5, 6, 7, 1, 2, 8, 9, 1, 2};
        int [] numbersArray = new int[] {1, 2};
        PatternFinder patternFinder = new BestPatternFinder();
        System.out.println(patternFinder.countPattern(numbersArray, 1, 2) + " occurrence");
    }

}