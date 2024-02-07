class Solution {
    public static int num(int numer, int denom) {
        int max = 1;
        for (int i=1;i<=numer && i<=denom;i++) {
            if (numer%i == 0 && denom%i == 0) {
                max = i;
            }
        }
        return max;
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int[] answer = {numer/num(numer, denom), denom/num(numer, denom)};
        return answer;
    }
}