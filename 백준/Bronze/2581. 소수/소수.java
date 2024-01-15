import java.util.*;
import java.io.*;

class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    List<Integer> result = new ArrayList<Integer>();
    int sum = 0;
    for (int i = a; i <= b; i++) {
      if (i != 1 && sosuCheck(i)) {
        result.add(i);
        sum += i;
      }
    }
    result.sort(Comparator.naturalOrder());
    if (!result.isEmpty()) {
      System.out.println(sum);
      System.out.println(result.get(0));
    } else {
      System.out.println(-1);
    }
  }

  public static boolean sosuCheck(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}