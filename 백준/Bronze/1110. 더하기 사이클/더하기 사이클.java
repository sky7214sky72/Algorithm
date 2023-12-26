import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    if (Integer.parseInt(a) < 10) {
      a = "0" + a;
    }
    String result = null;
    int answer = 1;
    while (true) {
      if (result == null) {
        result = a;
      }
      int left = Integer.parseInt(result.substring(0, 1));
      int right = Integer.parseInt(result.substring(1));
      int sumValue = left + right;
      if (sumValue >= 10) {
        sumValue = Integer.parseInt(Integer.toString(sumValue).substring(1));
      }
      result = right + Integer.toString(sumValue);
      if (a.equals(result)) {
        break;
      }
      answer++;
    }
    System.out.println(answer);
    }
}