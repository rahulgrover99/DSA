class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] lHeight = new int[len];
        int[] rHeight = new int[len];
        int trappedWater = 0;
        int lMaxHeight = 0;
        int rMaxHeight = 0;
        lHeight[0] = 0;
        rHeight[len - 1] = 0;
        int minVal = 0;
        for(int i = 1; i < len; i++) {
            if(lMaxHeight < height[i - 1]) {
                lMaxHeight = height[i - 1];
            }
            lHeight[i] = lMaxHeight;
        }
        for(int i = len - 2; i >= 0; i--) {
            if(rMaxHeight < height[i + 1]) {
                rMaxHeight = height[i + 1];
            }
            rHeight[i] = rMaxHeight;
        }
        for(int i = 0; i < len; i++) {
            minVal = (Math.min(lHeight[i], rHeight[i]));
            if(minVal > height[i]) {
                trappedWater += (minVal - height[i]);
            }
        }
        return trappedWater;
    }
}
