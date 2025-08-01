import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int maxValue = 0;
        int maxIndex = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] >= maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIndex+1);
    }
}