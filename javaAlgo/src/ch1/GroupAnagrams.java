package ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * . 그룹 애너그램
 * 문자열 배열을 받아 애너그램 단위로 그룹핑하라
 * 입력 : ["eat", "tea", "tan", "ate", "ant", "cat"]
 * 출력 : [
 *    ["ate", "eat", "tea"],
 *    ["ant", "tan"],
 *    ["cat"]
 * ]
 * 애너그램: 문자구성이 똑같은걸 뜻함
 */
public class GroupAnagrams {
  public static List<List<String>> groupAnagrams(String[] strs) {
    //애너그램 결과를 보관하기 위한 맵 선언
    Map<String, List<String>> results = new HashMap<>();
    // 입력값 순회
    for (String str : strs) {
      //문자열을 문자 배열로 변환
      char[] chars = str.toCharArray();
      //문자 배열 정렬
      Arrays.sort(chars);
      //문자 배열을 키로 하기 위해 다시 문자열로 변환
      String key = String.valueOf(chars);
      //기존에 없던 키라면 빈 리스트 삽입
      if (!results.containsKey(key)) {
        results.put(key, new ArrayList<>());
      }
      //키에 해당하는 리스트에 추가
      results.get(key).add(str);
    }
    //문제에서 요구하는 형태로 변경
    return new ArrayList<>(results.values());
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split(" ");
    sc.close();
    System.out.println(groupAnagrams(str));
  }
}
