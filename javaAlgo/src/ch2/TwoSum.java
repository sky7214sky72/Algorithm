package ch2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * . 덧셈하여 타깃을 만들 수 있는 배열의 두 숫자 인덱스를 리턴하라
 * 입력 : nums = [2,6,11,15], target = 8
 * 출력 : [0,1]
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    TwoSum ts = new TwoSum();
    System.out.println(Arrays.toString(ts.twoSum(new int[]{2, 6, 11, 15}, target)));
  }
}
