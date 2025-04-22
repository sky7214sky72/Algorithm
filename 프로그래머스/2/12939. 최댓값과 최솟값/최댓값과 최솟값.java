class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String n : s.split(" ")) {
            int m = Integer.parseInt(n);
            if (m >= max) {
                max = m;
            }
            
            if (m <= min) {
                min = m;
            }
        }
        return String.valueOf(min) + " " +String.valueOf(max);
    }
}