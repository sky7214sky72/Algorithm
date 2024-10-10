package ch1;

import java.util.Scanner;

/**
 * . 팰린드롬 확인
 *   입력 : Do geese see God?
 *   출력 : true
 */
public class ValidPalindrome {

  public static boolean isPalindrome(String s) {
    boolean isPalindrome = true;
    //정규식으로 유효한 문자만 추출한 다음 모두 소문자로 변경
    String sFiltered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    //문자열을 뒤집은 다음 String으로 변경
    String sReversed = new StringBuilder(sFiltered).reverse().toString();
    return sFiltered.equals(sReversed);
  }
  public static void main(String[] args) {
    String s = new Scanner(System.in).nextLine();
    System.out.println(isPalindrome(s));
  }
}
