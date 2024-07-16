class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> frequency = new HashMap<>();

        for(String s : words){
            for(char c : s.toCharArray()){
                frequency.put(c,frequency.getOrDefault(c,0) + 1);
            }
        }
        int n = words.length;
        for(Integer count : frequency.values()){
            if(count % n != 0) return false;
        }
        return true;
    }
}