import java.util.*;
import java.io.*;
class Main {
    static int N,M;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;
        // 0,1,2
        for (int i=0;i<N-2;i++) {
            //1,2,3
            for (int j=i+1;j<N-1;j++) {
                //2,3,4
                for (int k=j+1;k<N;k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == M) {
                        System.out.println(sum);
                        return;
                    }
                    if (sum < M && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}