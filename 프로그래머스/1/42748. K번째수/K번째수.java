import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command : commands) {
            int[] cut = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(cut);
            answer[index] = cut[command[2]-1];
            index++;
        }
        return answer;
    }
}