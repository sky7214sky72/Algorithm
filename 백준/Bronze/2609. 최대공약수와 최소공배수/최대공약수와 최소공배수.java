import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        while (a%b != 0) {
            int c = a%b;
            if (c !=0) {
                a = b;
                b = c;
            }
        }
        System.out.println(b);
        System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]) / b);
    }
}