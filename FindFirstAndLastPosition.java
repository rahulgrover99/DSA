class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int l = 0, r = nums.length - 1;
    
        while(l <= r) {
            int mid = (l + r)/2;

            if(nums[mid] == target) {
                result[0] = mid;
                result[1] = mid;

                while(result[0] > 0 && nums[result[0] - 1] == target) result[0]--;
                while(result[1] < nums.length - 1 && nums[result[1] + 1] == target) result[1]++;

                break;
            }

            if(nums[mid] < target) l = mid + 1;
            else if(nums[mid] > target) r = mid - 1;
            else {
                
            }
        }
        return result;
    }
}
