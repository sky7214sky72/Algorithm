class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] myArray = my_string.split("");
        String first = myArray[num1];
        String second = myArray[num2];
        String answer = "";
        for (int i=0;i<myArray.length;i++) {
            if (i == num1) {
                answer += second;
            } else if (i == num2) {
                answer += first;
            } else {
                answer += myArray[i];
            }
        }
        return answer;
    }
}