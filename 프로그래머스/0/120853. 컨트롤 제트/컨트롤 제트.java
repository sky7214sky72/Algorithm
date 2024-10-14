class Solution {
    public int solution(String s) {
        String[] sArray = s.split(" ");
        int index = 0;
        int answer = 0;
        for (String a : sArray) {
            if (a.equals("Z")) {
                answer-=Integer.parseInt(sArray[index-1]);
            } else {
                answer+=Integer.parseInt(a);
            }
            index++;
        }        
        return answer;
    }
}