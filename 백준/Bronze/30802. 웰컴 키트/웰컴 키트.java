import java.util.*;
import java.io.*;
import java.math.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        
        int[] tshirtCounts = Arrays.stream(br.readLine().trim().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        String[] tokens = br.readLine().trim().split(" ");
        int t = Integer.parseInt(tokens[0]);
        int p = Integer.parseInt(tokens[1]);
        int resultFirst = 0;
        int resultSecond = n/p;
        int resultThird = n%p;
        //답 구하기
        for (int shirt : tshirtCounts) {
            resultFirst+=(int) Math.ceil((double) shirt / t);
        }
        System.out.println(resultFirst);
        System.out.println(String.valueOf(resultSecond) + " " + String.valueOf(resultThird));
    }
}