import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<progresses.length;i++) {
            int days = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(days);
        }
        while(!queue.isEmpty()) {
            int first = queue.poll();
            int count = 1;
            while(!queue.isEmpty() && queue.peek() <= first) {
                count+=1;
                queue.poll();
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}