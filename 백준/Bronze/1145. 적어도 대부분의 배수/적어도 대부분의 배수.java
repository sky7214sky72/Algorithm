import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    String[] arr = s.split(" ");
    int flag = 1;
    int check = 1;
    while (true) {
      for (String string : arr) {
        if (flag % Integer.parseInt(string) == 0) {
          check++;
        }
      }
      if (check >= 3) {
        System.out.println(flag);
        break;
      }
      check = 0;
      flag++;
    }
    }
}