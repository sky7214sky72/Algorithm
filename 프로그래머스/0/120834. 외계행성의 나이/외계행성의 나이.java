class Solution {
    public String solution(int age) {
        String[] alphabet = new String[26];
        char currentChar = 'a';
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(currentChar);
            currentChar++;
        }
        String strAge = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<strAge.length();i++) {
            int index = Integer.parseInt(Character.toString(strAge.charAt(i)));
            sb.append(alphabet[index]);
        }
        String answer = sb.toString();
        return answer;
    }
}