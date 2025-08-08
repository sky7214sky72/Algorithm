import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<num;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int j=0;j<str.length();j++) {
                int count =0;
                while (count < n) {
                    sb.append(str.charAt(j));
                    count++;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}