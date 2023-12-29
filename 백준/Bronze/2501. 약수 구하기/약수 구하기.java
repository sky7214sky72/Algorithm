import java.util.*;
import java.io.*;
public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String[] arr = a.split(" ");
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= Integer.parseInt(arr[0]); i++) {
      if (Integer.parseInt(arr[0]) % i == 0) {
        list.add(i);
      }
    }
    if (Integer.parseInt(arr[1]) > list.size()) {
      System.out.println(0);
    } else {
      Collections.sort(list);
      System.out.println(list.get(Integer.parseInt(arr[1]) - 1));
    }
  }
}