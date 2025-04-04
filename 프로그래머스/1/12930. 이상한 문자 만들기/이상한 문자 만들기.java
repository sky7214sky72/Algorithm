class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0; // 단어 내 인덱스 (공백 기준 초기화됨)

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                sb.append(' ');
                idx = 0; // 단어가 끝났으니 인덱스 초기화
            } else {
                if (idx % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                idx++;
            }
        }

        return sb.toString();
    }
}