class Solution {
    public int splitArray(int[] nums, int k) {
        int l = nums[0];
        int h = 0;
        
        for(int num : nums) {
            l = Math.max(l, num);
            h += num;
        }

        while(l <= h) {
            int mid = l + (h - l)/2;
            if(getPartitionsCount(nums, mid) <= k) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static int getPartitionsCount(int[] nums, int mSum) {
        int partition = 1;
        long arraySum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(arraySum + nums[i] > mSum) {
                partition++;
                arraySum = nums[i];
            } else {
                arraySum += nums[i];
            }
        }
        return partition;
    }
}
