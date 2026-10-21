import java.util.*;
class Solution {
    public String solution(String new_id) {
        //1단계 대문자 -> 소문자
        String answer = new_id.toLowerCase();
        //2단계 허용하는 문자 (소문자,숫자,빼기,밑줄,마침표) 제외한 문자 제거
        answer = answer.replaceAll("[^a-z0-9._-]", "");
        //3단계 마침표가 2번이상 연속된다면 하나로 치환
        answer = answer.replaceAll("\\.{2,}", ".");
        //4단계 마침표가 처음이나 끝에 위치하면 제거
        answer = answer.replaceAll("^\\.|\\.$", "");
        //5단계 빈문자열이면 a를 넣는다
        if (answer.isEmpty()) {
            answer = "a";
        }
        //6단계 16자 이상이면 15개 제외 나머지 제거하고 제거하고 마지막이 마침표면 마침표도 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("\\.$", "");
        //7단계 2자리 이하면 마지막 문자를 3이 될때까지 반복해서 붙인다
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        return answer;
    }
}