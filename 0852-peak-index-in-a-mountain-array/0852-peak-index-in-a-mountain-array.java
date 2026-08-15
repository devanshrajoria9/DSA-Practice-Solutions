class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while(low <= high){
            int guss = (low + high)/2;

            if(arr[guss] < arr[guss + 1]){
                low = guss + 1;
            }else{
                res = guss;
                high = guss - 1;
            }
        }
        return res;
    }
}