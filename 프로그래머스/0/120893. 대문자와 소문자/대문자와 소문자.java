class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (String s: my_string.split("")) {
            if ((int) s.charAt(0) >= 97 && (int) s.charAt(0) <= 122) {
                int num = s.charAt(0) - 32;
                answer+= (char) num;
            } else {
                int num = s.charAt(0) + 32;
                answer+= (char) num;
            }
        }
        
        return answer;
    }
}