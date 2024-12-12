class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int mid = 0;
        if(nums[0] < nums[r]) return nums[0];
        while(l < r) {
            mid = (l + r)/2;
            if(nums[mid] < nums[r]) r = mid;
            else l = mid + 1;
        }
        return nums[l];
    }
}
