package ch1;

import java.util.Scanner;

/**
 * . 가장 긴 팰린드롬 부분 문자열 가장 긴 팰린드롬 부분 문자열을 출력하라
 * . 입력: dcbabcdd
 * . 출력: dcbabcd
 * . 팰린드롬: 뒤집어봐도 같은 문자인걸 말함
 */
public class LongestPalindromicSubstring {

  static int left;
  static int maxLen;

  public static void extendPalindrome(String s, int j, int k) {
    //투 포인터가 유효한 범위 내에 있고 양쪽 끝 문자가 일치하는 팰린드롬인 경우 범위 확장
    while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
      j--;
      k++;
    }
    //기존 최대 길이보다 큰 경우 값 교체
    if (maxLen < k - j - 1) {
      left = j + 1;
      maxLen = k - j - 1;
    }
  }

  public static String longestPalindrome(String s) {
    //문자 길이 저장
    int len = s.length();
    //길이가 1인 경우 예외 처리
    if (len < 2) {
      return s;
    }
    //우측으로 한 칸씩 이동하며 투 포인터 조사
    for (int i = 0; i < len - 1; i++) {
      extendPalindrome(s, i, i + 1);
      extendPalindrome(s, i, i + 2);
    }
    //왼쪽과 최대 길이만큼을 더한 오른쪽 만큼의 문자를 정답으로 리턴
    return s.substring(left, left + maxLen);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    System.out.println(longestPalindrome(s));
  }
}
