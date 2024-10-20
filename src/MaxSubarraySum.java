public class MaxSubarraySum {

    public static void main(String[] args) {
//        int[] myNum = { -3, -4, 5, -1, 2, -4, 6, -1};
        int[] myNum = {-2, 3, 4, -1, -5, -10, 7};
//        System.out.println(maxProfitBruteForce(myNum, 8));
        System.out.println(maxProfit(myNum, 8));
    }

    static int maxProfitBruteForce(int []arr, int n) {
        int maxAns = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (currSum > maxAns) maxAns = currSum;
            }
        }
        return maxAns;
    }

    static int maxProfit(int []arr, int n) {
        int maxSum = -999999999;
        int currSum = 0;
        int dayBuy = 0;
        int daySell = 0;
        int finalBuy = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum >= maxSum) {
                // Max sum received
                // Store the day we should sell.
                // Store the day, for which we would have bought.
                maxSum = currSum;
                daySell = i;
                finalBuy = dayBuy;
            }

            if (currSum < 0) {
                currSum = 0;
                dayBuy = i + 1;
            }
        }

        return maxSum;
    }
}
