class Solution {
    public String losingPlayer(int x, int y) {
        
        int turn = Math.min(x, y / 4);
        if(turn % 2 == 1) return "Alice";
        return "Bob";

    }
}