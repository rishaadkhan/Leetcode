class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int res = 0;
        for(int i : freq){
            if(i < 3){
                res += i;
            }
            else{
                i = i % 2;
                if(i == 0){
                    res += 2;
                }
                
                res += i;
            }
        }
        return res;
    }
}