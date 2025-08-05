import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("");
        int result = 0;
        for (String a : nums) {
            result+=Integer.parseInt(a);
        }
        System.out.println(result);
    }
}