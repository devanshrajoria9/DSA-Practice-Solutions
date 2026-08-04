class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }
        return fun(have, need);
    }

    public Boolean fun(HashMap<Character, Integer> have,
            HashMap<Character, Integer> need) {
        for (char ch : need.keySet()) {
            if (have.getOrDefault(ch, 0) < need.get(ch)) {
                return false;
            }
        }
        return true;
    }
}