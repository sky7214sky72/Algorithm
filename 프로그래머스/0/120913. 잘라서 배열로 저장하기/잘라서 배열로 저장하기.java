class Solution {
    public String[] solution(String my_str, int n) {
        int number = my_str.length()%n > 0 ? my_str.length()/n + 1 : my_str.length()/n;
        String[] answer = new String[number];
        int start = 0;
        for (int i=0;i<answer.length;i++) {            
            if (i == answer.length -1) {
                answer[i] = my_str.substring(start);
            } else {
                answer[i] = my_str.substring(start, n+start);
            }
            start+=n;
        }
        return answer;
    }
}