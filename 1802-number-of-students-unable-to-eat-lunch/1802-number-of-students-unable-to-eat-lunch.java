class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle = 0, square = 0;
        Stack<Integer> sand = new Stack<>();
        for(int i = 0; i < students.length; i++){
            if(students[i] == 0){
                circle++;
            }
            else square++;
            sand.push(sandwiches[students.length - i - 1]);
        }

        while(sand.size() > 0){
            if(sand.peek() == 0 && circle > 0){
                sand.pop();circle--;
            }
            else if (sand.peek() == 1 && square > 0){
                sand.pop(); square--;

            }
            else break;
        }
        return circle + square;
    }
}