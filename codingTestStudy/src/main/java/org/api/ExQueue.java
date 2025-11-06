package org.api;

import java.util.LinkedList;
import java.util.Queue;

/*
언제 쓰나?

"가장 먼저 넣은 것을 먼저 뺀다" (FIFO) 구조일 때.

BFS (너비 우선 탐색) 알고리즘에서.
 */
public class ExQueue {

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.offer(2);

    int front = queue.poll(); // 값 빼기 (맨 앞)

    int peekVal = queue.peek(); // 값 확인 (맨 앞, 빼지는 않음)

    if (!queue.isEmpty()) {
      // ...
    }
  }
}
