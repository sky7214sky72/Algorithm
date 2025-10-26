package org.api;

import java.util.HashMap;
import java.util.Map;

/*
  . 1. HashMap
   - 언제쓰나?
     1. 데이터의 존재 여부를 O(1)로 빠르게 확인해야 할 때 (배열/리스트는 O(N))
     2. (Key, Value) 쌍으로 데이터를 저장해야 할 때 (예: 이름, 점수)
     3. 횟수 카운팅 할때 (예: A 3번, B 2번)
 */
public class ExHashMap {

  public static void main(String[] args) {
    //선언
    Map<String, Integer> map = new HashMap<>();

    // 1. 값 넣기 (Key: 이름, Value: 점수)
    map.put("Alice", 100);
    map.put("Bob", 90);

    // 2. 값 가져오기 (O(1))
    int score = map.get("Alice"); // 100

    // 3. (*필수 암기) 횟수 카운팅 / 값 안정하게 가져오기
    // Bo이 있으면 그 값을, 없으면 0을 반환
    int bobScore = map.getOrDefault("Bob", 0); // 90
    int charlieScore = map.getOrDefault("Charlie", 0); // 0

    // 4. (*필수 암기) 횟수 카운팅 용법
    // map.getOrDefault(key, 0) + 1
    String[] participants = {"leo", "kiki", "eden", "leo"};
    for (String p : participants) {
      map.put(p, map.getOrDefault(p, 0) + 1);
    }

    // 5. Key 존재 여부 확인 (O(1))
    if (map.containsKey("Alice")) {
      // ...
    }

    // 6. 전체 순회 (Key, Value 모두 필요시)
    for (Map.Entry<String, Integer> entry: map.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
    }

    // 7. 전체 순회 (Key만 필요시)
    for (String key: map.keySet()) {
      // ...
    }
  }
}
