import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        //수포자 찍기 패턴 정리
        int[][] people = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        int[] scores = new int[3];
        int maxScore = 0;
        for (int i=0;i<people.length;i++) {
            for (int j=0;j<answers.length;j++) {
                if (answers[j] == people[i][j % people[i].length]) {
                    scores[i] +=1;
                }
            }
            maxScore = Math.max(maxScore, scores[i]);
        }
        List<Integer> answer = new ArrayList<>();
        for (int i=0;i<scores.length;i++) {
            if (scores[i] == maxScore) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}