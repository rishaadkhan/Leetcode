class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int largestSub = -1, n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    int count = 0;
                    for (int k = i + 1; k < j ; k++) {
                        count++;
                    }
                    largestSub = Math.max(count, largestSub);
                }
            }
        }
        return largestSub;
    }
}