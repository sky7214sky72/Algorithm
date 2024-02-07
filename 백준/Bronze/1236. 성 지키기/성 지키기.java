import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int a = 0;
    int b = 0;
    boolean[][] castle = new boolean[N][M];
    String temp;
    for (int i = 0; i < N; i++) {
      temp = br.readLine();
      for (int j = 0; j < M; j++) {
        if (temp.charAt(j) == 'X') {
          castle[i][j] = true;
        }
      }
    }
    boolean hasguard;
    for (int i = 0; i < N; i++) {
      hasguard = false;
      for (int j = 0; j < M; j++) {
        if (castle[i][j]) {
          hasguard = true;
          break;
        }
      }
      if (!hasguard) {
        a++;
      }
    }
    for (int i = 0; i < M; i++) {
      hasguard = false;
      for (int j = 0; j < N; j++) {
        if (castle[j][i]) {
          hasguard = true;
          break;
        }
      }
      if (!hasguard) {
        b++;
      }
    }
    System.out.println(Math.max(a, b));
  }
}