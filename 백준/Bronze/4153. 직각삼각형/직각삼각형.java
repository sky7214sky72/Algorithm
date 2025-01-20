import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      int xDouble = x * x;
      int yDouble = y * y;
      int zDouble = z * z;
      int[] arr = {xDouble, yDouble, zDouble};
      Arrays.sort(arr);
      if (x == 0 && y == 0 && z == 0) {
        break;
      }
      if (arr[2] == (arr[0] + arr[1])) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}