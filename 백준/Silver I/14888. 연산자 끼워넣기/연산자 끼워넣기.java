import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;   
    public static int N;
    public static int[] num2;
    public static int[] num3;    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num2 = new int[N];
        num3 = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //숫자 입력
        for (int i=0;i<N;i++) {
            num2[i] = Integer.parseInt(st.nextToken());
        }
        //연산자 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<4;i++) {
            num3[i] = Integer.parseInt(st.nextToken());
        }        
        cal(num2[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);        
    }
    public static void cal(int num, int idx) {
        if (idx == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }
        for (int i=0;i<4;i++) {
            if (num3[i] > 0) {
                // 해당 연산자를 1 감소시킨다.
				num3[i]--;
 
				switch (i) {
 
				case 0:	cal(num + num2[idx], idx + 1);	break;
				case 1:	cal(num - num2[idx], idx + 1);	break;
				case 2:	cal(num * num2[idx], idx + 1);	break;
				case 3:	cal(num / num2[idx], idx + 1);	break;
 
				}
				// 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
				num3[i]++;
            }
        }
    }
}