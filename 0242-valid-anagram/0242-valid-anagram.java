class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int n = s.length();
        int m = t.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            char sh = t.charAt(i);
            freq.put(sh, freq.getOrDefault(sh, 0) - 1);
        }
        for (int value : freq.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}