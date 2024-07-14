class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while(l <= r){
            long mid = l + (r - l) / 2;
            long curr = mid * mid;

            if(curr == num) return true;
            else if(curr > num) r = (int)mid - 1;
            else l =(int) mid + 1;
        }
        return false;
    }
}