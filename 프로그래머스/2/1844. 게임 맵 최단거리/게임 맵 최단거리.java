import java.util.*;

class Solution {
    
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] distance = new int[n][m];
        for (int i=0;i<n;i++) {
            Arrays.fill(distance[i], 0);
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        distance[0][0] = 1;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = distance[x][y];
            
            if (x == n-1 && y == m-1) {
                return dist;
            }
            
            for (int i=0;i<4;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (maps[nx][ny] == 0) continue;
                if (distance[nx][ny] != 0) continue;
                
                distance[nx][ny] = dist + 1;
                queue.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}