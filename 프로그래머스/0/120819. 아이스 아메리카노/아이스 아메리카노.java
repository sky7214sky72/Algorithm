class Solution {
    public int[] solution(int money) {
        int num = 0;
        while (money >= 5500) {
            num++;
            money -= 5500;
        }
        int[] answer = {num , money};
        return answer;
    }
}