class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle = 0, square = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                circle++;
            } else
                square++;

        }

        for (int i : sandwiches) {
            if (i == 0 && circle > 0) {
                circle--;
            } else if (i == 1 && square > 0) {
                square--;

            } else
                break;
        }
        return circle + square;
    }
}