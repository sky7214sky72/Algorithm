class Solution {
    public int[] solution(int[] array) {
        int index = 0;
        int maxValue = 0;
        for (int i=0;i<array.length;i++) {
            if (array[i] >= maxValue) {
                index = i;
                maxValue = array[i];
            }
        }
        int[] answer = {maxValue, index};
        return answer;
    }
}