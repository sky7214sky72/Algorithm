import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        //중복제거 위한 set 사용
        HashSet<Integer> result = new HashSet<>();
        //2중for문을 이용한 배열 합산 탐색
        for (int i=0;i<numbers.length;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }
        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}