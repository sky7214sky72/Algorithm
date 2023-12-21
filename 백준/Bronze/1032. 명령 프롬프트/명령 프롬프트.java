import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        boolean isSame = true;
        for (int i=0;i<arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            isSame = true;
            for (int j=1;j<n;j++) {
                if (c != arr[j].charAt(i)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame == true) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb.toString());
    }
}