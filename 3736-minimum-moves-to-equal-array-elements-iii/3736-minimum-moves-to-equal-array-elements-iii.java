class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += max - nums[i];
        }
        return total;
    }
}