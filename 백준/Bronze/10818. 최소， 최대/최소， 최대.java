import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<num;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.stream(arr).min().getAsInt() + " " +Arrays.stream(arr).max().getAsInt());
    }
}