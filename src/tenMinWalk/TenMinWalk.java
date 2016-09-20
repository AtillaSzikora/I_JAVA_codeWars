package tenMinWalk;

class TenMinWalk {
    static boolean isValid(char[] walk) {
        int blockCounter = 1;

        for (char letter : walk) {
            switch (letter) {
                case 'n' : blockCounter += 1;
                    break;
                case 's' : blockCounter -= 1;
                    break;
                case 'e' : blockCounter += 10;
                    break;
                case 'w' : blockCounter -= 10;
                    break;
            }
        }
        return walk.length == 10 && blockCounter == 1;
    }
}
