class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character, Integer> f = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }
        Boolean odd = false;
        int res = 0;

        for (char ch : f.keySet()) {
            int val = f.get(ch);

            if (val % 2 == 0) {
                res += val;
            } else {
                res += val - 1;
                odd = true;
            }
        }
        if (odd) {
            res++;
        }
        return res;
    }
}