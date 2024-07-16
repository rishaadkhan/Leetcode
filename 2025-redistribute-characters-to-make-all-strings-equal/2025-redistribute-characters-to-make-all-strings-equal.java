class Solution {
    public boolean makeEqual(String[] words) {
       int[] frequency = new int[26];

        for(String s : words){
            for(char c : s.toCharArray()){
                frequency[c -'a']++;
            }
        }
        int n = words.length;
        for(Integer count : frequency){
            if(count % n != 0) return false;
        }
        return true;
    }
}