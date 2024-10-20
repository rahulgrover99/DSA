class Solution {
    public int maxSubArray(int[] nums) {
        int maxVal = -9999999;
        int currentCount = 0;
        for(int i = 0; i < nums.length; i++) {
            currentCount += nums[i];
            if(currentCount > maxVal) {
                maxVal = currentCount;
            }
            if(currentCount < 0) {
                currentCount = 0;
            }
        }
        return maxVal;
    }
}
