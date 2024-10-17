import java.util.*;
class Solution {
    public long solution(String numbers) {
        List<String> numList = new ArrayList<>();
        numList.add("zero");
        numList.add("one");
        numList.add("two");
        numList.add("three");
        numList.add("four");
        numList.add("five");
        numList.add("six");
        numList.add("seven");
        numList.add("eight");
        numList.add("nine");
        for (int i=0;i<numList.size();i++) {
            numbers = numbers.replaceAll(numList.get(i), String.valueOf(i));
        }
        long answer = Long.parseLong(numbers);
        return answer;
    }
}