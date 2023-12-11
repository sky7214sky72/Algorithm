import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * . Main
 */

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String b = br.readLine();
    String[] second = b.split("");
    int one = Integer.parseInt(a) * Integer.parseInt(second[2]);
    int two = Integer.parseInt(a) * Integer.parseInt(second[1]) * 10;
    int three = Integer.parseInt(a) * Integer.parseInt(second[0]) * 100;
    System.out.println(one);
    System.out.println(two/10);
    System.out.println(three/100);
    System.out.println(one+two+three);
  }
}