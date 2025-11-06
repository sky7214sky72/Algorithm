package org.api;

import java.util.Stack;

/*
1. Stack (스택 - LIFO: 후입선출)
언제 쓰나?

"가장 마지막에 넣은 것을 먼저 뺀다" (LIFO) 구조일 때.

괄호 짝 맞추기.

뒤에서부터 비교해야 할 때.
 */
public class ExStack {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);

    int top = stack.pop();
    int peekVal = stack.peek();

    if (!stack.isEmpty()) {
      //
    }
  }
}
