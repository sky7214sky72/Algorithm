package ch1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * . 가장 흔한 단어
 * 금지된 단어를 제외하고 가장 흔하게 등장하는 단어를 출력하라
 * 대소문자 구분 X, 마침표, 쉼표 무시
 */
public class MostCommonWord {
  public static String mostCommonWord(String paragraph, String[] banned) {
    //금지어 목록이 String 배열이기 떄문에 비교 메소드를 제공하는 Set으로 변경
    Set<String> ban = new HashSet<String>(Arrays.asList(banned));
    //각 단어별 개수가 저장될 키-값 맵
    Map<String, Integer> counts = new HashMap<>();
    //전처리 작업 후 단어 목록을 배열로 저장
    String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
    for (String word : words) {
      //금지단어가 아니면 갯수 처리
      if (!ban.contains(word)) {
        //존재하지 않는 단어면 0으로 지정 아니면 +1해서 저장
        counts.put(word, counts.getOrDefault(word, 0) + 1);
      }
    }
    return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String paragraph = sc.nextLine();
    String[] banned = sc.nextLine().split(" ");
    sc.close();
    System.out.println(mostCommonWord(paragraph, banned));
  }
}
