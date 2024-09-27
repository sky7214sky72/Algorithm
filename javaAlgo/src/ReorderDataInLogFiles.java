import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 199 페이지 . 로그를 재정렬 하라
 * 1. 로그의 가장 앞부분은 식별자로서,순서에 영향을 끼치지 않는다.
 * 2. 문자로 구성된 로그가 숫자 로그보다 앞에 오며，문자 로그는 사전순으로 한다.
 * 3. 문자가 동일할 경우에는 식별자순으로 한다.
 * 4. 숫자 로그는 입력 순서대로 한다.
 * 입력 : ["id1 8 1 5 1","id2 art can","id3 3 6","id4 own kit dig","id5 art zero"]
 * 출력 : ["id2 art can","id5 art zero","id4 own kit dig","id1 8 15 1"，"id3 3 6"]
 */
public class ReorderDataInLogFiles {

  public static String[] reorderDataInLogFiles(String[] logFiles) {
    List<String> letterList = new ArrayList<>();
    List<String> digitList = new ArrayList<>();
    for (String log : logFiles) {
      if (Character.isDigit(log.split(" ")[1].charAt(0))) {
        digitList.add(log);
      } else {
        letterList.add(log);
      }
    }
    //정렬
    letterList.sort((s1, s2) -> {
      //식별자와 식별자 외로 나눈다.
      String[] s1x = s1.split(" ", 2);
      String[] s2x = s2.split(" ", 2);
      int compared = s1x[1].compareTo(s2x[1]);
      //문자가 동일하면 식별자 비교
      if (compared == 0) {
        return s1x[0].compareTo(s2x[0]);
      } else {
        //순서가 동일하면 0, 순서가 앞인 경우 1, 순서가 뒤인 경우 -1
        return compared;
      }
    });
    //문자 리스트 뒤로 숫자 리스트 이어 붙임
    //숫자로그는 입력 순서대로라고 요구사항이 있으니 따로 정렬 x
    letterList.addAll(digitList);
    return letterList.toArray(new String[0]);
  }

  public static void main(String[] args) {
    String[] input = {"id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"};
    System.out.println(Arrays.toString(reorderDataInLogFiles(input)));
  }
}
