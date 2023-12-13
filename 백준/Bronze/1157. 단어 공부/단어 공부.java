import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().toUpperCase();
        int[] arr = new int[26];
        for (int i=0;i<a.length();i++) {
            int num = a.charAt(i) - 'A';
            arr[num]++;
        }
        int max = 0;
        char result = '?';
        for (int i=0;i<arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
                result = (char) (i+'A');
            } else if (max == arr[i]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}