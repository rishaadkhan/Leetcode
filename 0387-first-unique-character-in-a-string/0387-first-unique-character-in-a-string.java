class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> unique = new HashMap<>();
        // int l = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            unique.put(s.charAt(i), unique.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {

            if (unique.get(s.charAt(i)) == 1)
                return i;

        }
        return -1;
    }
}