import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int num = 0;num<N;num++) {
            arr[num] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;        
        for (int i=0;i<N-2;i++) {
            for (int j=i+1;j<N-1;j++) {
                for (int k=j+1;k<N;k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == M) {
                        System.out.println(sum);
                        return;
                    }
                    if (sum < M && sum > answer) {
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}