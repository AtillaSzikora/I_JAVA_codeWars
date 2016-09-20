package findEvenIndex;

class FindEvenIndex {
    static int findEvenIndex(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < i; j++) {
                left += arr[j];
            }
            for (int k = arr.length - 1; k > i; k--) {
                right += arr[k];
            }
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
