import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<a;i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());
        int answer =0;
        for (int arr : b) {
            if (target == arr) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}