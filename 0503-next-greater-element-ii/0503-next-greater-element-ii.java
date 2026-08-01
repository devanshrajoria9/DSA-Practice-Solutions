class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(nums[n - 1]);
        for (int i = 2 * n - 2; i >= 0; i--) {
            int ind = i % n;
            while (!st.isEmpty() && st.peek() <= nums[ind]) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty()) {
                    res[ind] = -1;
                } else {
                    res[ind] = st.peek();
                }
            }
            st.push(nums[ind]);
        }
        return res;
    }
}