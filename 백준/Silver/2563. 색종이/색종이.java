import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean[][] a = new boolean[101][101];
        int answer = 0;
        for (int i=0;i<num;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j=x;j<x+10;j++) {
                for (int k=y;k<y+10;k++) {
                    if (!a[j][k]) {
                        a[j][k] = true;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}