class Solution {
    public int solution(String str1, String str2) {
        String str = str1.replaceAll(str2, "");
        System.out.println(str);
        int answer = 2;
        if (!str.equals(str1)) {
            answer = 1;
        }        
        return answer;
    }
}