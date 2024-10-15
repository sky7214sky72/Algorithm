import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        String[] cipherArray = cipher.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<cipherArray.length;i++) {
            if ((i+1)%code == 0) {
                stringBuilder.append(cipherArray[i]);
            }
        }
        String answer = stringBuilder.toString();
        return answer;
    }
}