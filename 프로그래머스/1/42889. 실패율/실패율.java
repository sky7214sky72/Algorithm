import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] challenger = new int[N+2];
        for (int stage : stages) {
            challenger[stage]++;
        }
        
        Map<Integer, Double> failRate = new HashMap<>();
        Double user = (double) stages.length;
        for (int i=1;i<=N;i++) {
            if (challenger[i] == 0) {
                failRate.put(i,0.0);
            }
            else {
             failRate.put(i, (double) challenger[i]/user);   
            }
            user-= challenger[i];
        }
        
        return failRate.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}