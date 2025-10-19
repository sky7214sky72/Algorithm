import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numInt = Integer.parseInt(scan.nextLine());
    String numString = scan.nextLine();
    String[] numArray = numString.split(" ");
    int result = 0;
    for (String num : numArray) {
      int n = Integer.parseInt(num);
      int count = 0;
      if (n <= 1) {
        continue;
      }
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          count++;
        }
      }
      if (count == 0) {
        result++;
      }
    }
    System.out.println(result);
  }
}