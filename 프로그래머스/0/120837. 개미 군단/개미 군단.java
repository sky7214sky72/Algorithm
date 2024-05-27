class Solution {
    public int solution(int hp) {
        int[] ant = {5,3,1};
        int answer = 0;
        for (int i=0;i<ant.length;i++) {
            int num = hp / ant[i];
            hp = hp % ant[i];
            answer += num;
        }
        return answer;
    }
}