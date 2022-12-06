package wallet;

import java.util.HashSet;


/**
 * Coin Determiner
 * Have the function CoinDeterminer(num) take the input,
 * which will be an integer ranging from 1 to 250, and return an integer output that will
 * specify the least number of coins, that when added, equal the input integer.
 * Coins are based on a system as follows: there are coins representing the integers 1, 5, 7, 9, and 11. So for example:
 * if num is 16, then the output should be 2 because you can achieve the number 16 with the coins 9 and 7. If num is 25,
 * then the output should be 3 because you can achieve 25 with either 11, 9, and 5 coins or with 9, 9, and 7 coins.
 */
class CoinCountCalculator {
    private static final HashSet<Integer> coinSet = new HashSet<>();

    public static int determineCoinCount(int num) {
        initCoinSet();
        int coinCount = 0;
        return getRecursive(coinCount, num);
    }

    public static void main(String[] args) {
        System.out.print(determineCoinCount(50));
    }

    private static void initCoinSet() {
        coinSet.add(1);
        coinSet.add(5);
        coinSet.add(7);
        coinSet.add(9);
    }

    private static int getRecursive(int coinCount, int num) {
        if (coinSet.contains(num)) {
            coinCount = 1;
            return coinCount;
        }
        int lastSmallCoinBeforeNum = getLastSmallCoinBeforeNum(num);
        int reminder = num % lastSmallCoinBeforeNum;
        int result = num / lastSmallCoinBeforeNum;
        coinCount += result;
        if (coinSet.contains(reminder)) {
            coinCount += 1;
        }
        else {
            return getRecursive(coinCount, reminder);
        }
        return coinCount;
    }

    private static int getLastSmallCoinBeforeNum(int num) {
        int lastSmallCoinBeforeNum = 1;
        for (Integer e : coinSet) {
            if (num > e) {
                lastSmallCoinBeforeNum = e;
            }
        }
        return lastSmallCoinBeforeNum;
    }
}