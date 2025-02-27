class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        for (String key: keyinput) {
            switch(key) {
                case "left":
                    if (answer[0] > -xLimit) {
                        answer[0]--;
                    }
                    break;
                case "right":
                    if (answer[0] < xLimit) {
                        answer[0]++;
                    }
                    break;
                case "up":
                    if (answer[1] < yLimit) {
                        answer[1]++;
                    }
                    break;
                case "down":
                    if (answer[1] > -yLimit) {
                        answer[1]--;
                    }
                    break;
            }
        }
        return answer;
    }
}