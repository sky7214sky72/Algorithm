package org.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExArrayList {
  /*
    언제쓰나?
     1. 데이터를 순서대로 저장하고, 인덱스로 접근해야 할 때. (코테이션 LinkedList 거의 안 씀)
   */
 public static void main(String[] args) {
   // 선언
   List<Integer> list = new ArrayList<>();

   // 1. 값 추가
   list.add(10);
   list.add(30);
   list.add(20); // [10,30,20]

   // 2. 값 가져오기
   int val = list.get(1); //30

   // 3. (*필수 암기) 정렬
   // 오름차순
   Collections.sort(list); // [10, 20, 30]
   // 내림차순
   list.sort(Collections.reverseOrder()); // [30, 20, 10]
 }
}
