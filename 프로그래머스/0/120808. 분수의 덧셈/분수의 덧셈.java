class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        //통분
        int commonNumer = numer1 * denom2 + numer2 * denom1;
        int commonDenom = denom1 * denom2;
        int gcd = getGcd(commonNumer, commonDenom);
        answer[0] = commonNumer / gcd;
        answer[1] = commonDenom / gcd;
        return answer;
    }
    
    public int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}