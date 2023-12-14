/**
121
1231
12421
0
**/
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String a = br.readLine();
            int leng = a.length();
            boolean result = true;
            if (a.equals("0")) {
                break;
            }
            for (int i=0; i<=leng/2;i++) {
                if (a.charAt(i) != a.charAt(leng-i-1)) {
                    result = false;
                }
            }
            if (result) {  
                sb.append("yes\n");
            } else {  
                sb.append("no\n");
            }
        }
        System.out.print(sb);
    }
}