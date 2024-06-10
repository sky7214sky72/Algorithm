class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int index = 0;
        if (direction.equals("right")) {
            for (int i=0;i<numbers.length;i++) {
                if (i+1 >= numbers.length) {
                    index =  (i+1) % numbers.length;
                } else {
                    index =  i+1;
                }
                answer[index] = numbers[i];
            }
        } else {
            for (int i=0;i<numbers.length;i++) {
                if (i-1 < 0) {
                    index =  numbers.length-1 ;
                } else {
                    index =  i-1 ;
                }                
                answer[index] = numbers[i];                
            }               
        }     
        return answer;
    }
}