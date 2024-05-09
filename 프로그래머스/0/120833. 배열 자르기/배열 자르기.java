class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int flag = num1;
        for (int j=0;j<answer.length;j++) {
            answer[j] = numbers[flag];
            flag++;
        }
        return answer;
    }
}