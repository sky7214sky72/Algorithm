import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i=0;i<s.length;i++) {
            if (Integer.parseInt(s[i]) >= maxValue) {
                maxValue = Integer.parseInt(s[i]);
            }
            if (Integer.parseInt(s[i]) <= minValue) {
                minValue = Integer.parseInt(s[i]);
            }
        }
        System.out.println(maxValue * minValue);
    }
}