class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1;i<=n;i++) {
            if (hapsungsu(i)) {
                answer++;
            }
        }
        return answer;
    }
    public boolean hapsungsu(int num) {
        int count = 0;
        for (int i=1;i<=num;i++) {
            if (num%i == 0) {
                count++;
            }
        }
        if (count >= 3) {
            return true;
        }
        return false;
    }
}