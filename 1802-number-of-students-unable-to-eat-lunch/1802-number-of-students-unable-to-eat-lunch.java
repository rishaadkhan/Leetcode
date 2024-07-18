class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stud = new LinkedList<>();
        Stack<Integer> sand = new Stack<>();
        for(int i = 0; i < students.length; i++){
            stud.offer(students[i]);
            sand.push(sandwiches[students.length - i - 1]);
        }
        int count = 0;
        while(count < sand.size()){
            if(stud.peek() == sand.peek()){
                stud.poll(); sand.pop();
                count = 0;
            }
            else{
                stud.offer(stud.poll());
                count++;
            }
        }
        return stud.size();
    }
}