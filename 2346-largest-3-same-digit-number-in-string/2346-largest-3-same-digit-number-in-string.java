class Solution {
    public String largestGoodInteger(String num) {
        int[] freq = new int[10];
        int n = num.length();
        String largest = "";
        for(int i = 0; i < n - 2; i++){
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)){
                String curr = num.substring(i, i + 3);
                if(largest == "" || curr.compareTo(largest) > 0) largest = curr;
            }
        } 
        
        return largest;
    }
}