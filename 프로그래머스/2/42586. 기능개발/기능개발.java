import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        //각 기능 배포일 계산
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<progresses.length;i++) {
            int days = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(days);
        }
        while(!queue.isEmpty()) {
            int first = queue.poll();
            int count = 1;
            
            while(!queue.isEmpty() && queue.peek() <= first) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}