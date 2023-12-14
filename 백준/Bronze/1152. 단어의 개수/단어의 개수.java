import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        int result = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            result++;
        }
        System.out.println(result);
    }
}