class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int guss = (low + high) / 2;

            if (nums[guss] == target) {
                return guss;
            }
            if (nums[guss] < target) {
                low = guss + 1;
            } else {
                high = guss - 1;
            }
        }
        return -1;
    }
}