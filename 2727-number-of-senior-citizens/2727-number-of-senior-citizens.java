class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String current : details){
            String age = current.substring(11,13);
            
            if(Integer.parseInt(age) > 60){
                ans++;
            }

        }
        return ans;
    }
}