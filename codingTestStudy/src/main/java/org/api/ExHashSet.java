package org.api;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet {
  /*
     - 언제쓰나?
      1. 중복 제거가 필요할 때
      2. 데이터의 존재 여부만 O(1)로 빠르게 확인하면 될 때 (Value가 필요없을때)
   */
  public static void main(String[] args) {
    //선언
    Set<Integer> set  = new HashSet<>();

    // 1. 값 추가 (중복이면 안 들어감)
    set.add(1);
    set.add(2);
    set.add(1); //무시됨

    // set 결과: {1, 2}

    // 2.존재 여부 확인 (O(1))
    if (set.contains(2)) {
      // true
    }

    // 3. 값 제거
    set.remove(1);

    // 4. 크기
    int size = set.size(); // 1
  }
}
