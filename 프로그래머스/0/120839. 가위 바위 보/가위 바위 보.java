class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i=0;i<rsp.length();i++) {
            int n = Integer.parseInt(Character.toString(rsp.charAt(i)));
            if (n == 2) {
                answer+="0";
            } else if (n == 0) {
                answer+="5";
            } else {
                answer+="2";
            }
        }
        return answer;
    }
}