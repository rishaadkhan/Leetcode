class Solution {
    public boolean rotateString(String s, String goal) {
        int sn = s.length(), goaln = goal.length();
        if(sn != goaln) return false;
        s = s + s;
        for(int i = 0; i <= sn ; i++){
            int j = 0;
            while(j < goaln && s.charAt(i + j) == goal.charAt(j)){
              j++;
            }
            if(j == goaln) return true;
            
        }
        return false;
    }
}