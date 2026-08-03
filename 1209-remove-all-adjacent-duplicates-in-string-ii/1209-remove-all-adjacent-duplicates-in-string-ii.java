class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();

        class pair {
            char ch;
            int count;

            pair(char ch, int count) {
                this.ch = ch;
                this.count = count;
            }
        }
        Stack<pair> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (st.isEmpty()) {
                st.push(new pair(c, 1));
                continue;
            }
            if (st.peek().ch != c) {
                st.push(new pair(c, 1));
                continue;
            }
            st.peek().count++;

            if (st.peek().count == k)
                st.pop();
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            pair p = st.peek();
            st.pop();
            for (int i = 0; i < p.count; i++) {
                res.append(p.ch);
            }
        }
        return res.reverse().toString();
    }
}