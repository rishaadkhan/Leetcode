class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int largestSub = -1, n = s.length();

        int[] frequencyMap = new int[26];
        Arrays.fill(frequencyMap, -1);
        for(int i =0 ; i < n; i++){
            if(frequencyMap[s.charAt(i) - 'a'] >= 0){
                largestSub = Math.max(
                    largestSub,
                    i - frequencyMap[s.charAt(i) - 'a'] - 1
                    ); 
            }
            else frequencyMap[s.charAt(i) - 'a'] = i;
        }

       
        return largestSub;
    }
}