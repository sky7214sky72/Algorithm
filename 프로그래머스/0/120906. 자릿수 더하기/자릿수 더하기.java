class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        int answer = 0;
        for (String s:num.split("")) {
            answer+=Integer.parseInt(s);
        }        
        return answer;
    }
}