import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        
        // 가장 큰 두 수의 곱 vs 가장 작은 두 수(음수일 가능성) 곱
        return Math.max(numbers[n-1] * numbers[n-2], numbers[0] * numbers[1]);
    }
}