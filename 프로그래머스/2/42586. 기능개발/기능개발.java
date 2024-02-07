import java.util.*;
class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i=0; i<progresses.length;i++) {
            queue.add((int)Math.ceil((100.0-progresses[i])/speeds[i]));
        }
        while(!queue.isEmpty()) {
            int minDay = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && queue.peek() <= minDay) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        return answer;
    }
}
