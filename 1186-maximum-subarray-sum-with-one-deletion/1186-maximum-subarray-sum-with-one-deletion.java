class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = 0;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevNoDelete = noDelete;
            noDelete = Math.max(arr[i], noDelete + arr[i]);

            oneDelete = Math.max(prevNoDelete, oneDelete + arr[i]);

            res = Math.max(res, Math.max(noDelete, oneDelete));
        }
        return res;
    }
}