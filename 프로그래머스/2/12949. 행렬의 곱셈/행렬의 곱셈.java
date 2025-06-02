class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int n = arr1.length;
        int m = arr2[0].length;
        int k = arr2.length; // arr2 반복을 위한 길이 찾기
        
        int[][] answer = new int[n][m]; //2차원 배열은 앞에 배열이 세로 뒤에 배열이 가로
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                for (int l=0;l<k;l++) {
                    answer[i][j] += arr1[i][l] * arr2[l][j];
                }
            }
        }
        
        return answer;
    }
}