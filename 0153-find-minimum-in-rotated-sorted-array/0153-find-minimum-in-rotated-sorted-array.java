class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n;
        int res = Integer.MIN_VALUE;

        while(low <= high){
            int guss = (low + high)/2;
            if(nums[guss] > nums[n - 1]){
                low = guss + 1;
            }else{
                res = nums[guss];
                high = guss - 1;
            }
        }
        return res;
    }
}