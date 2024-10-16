import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int[] nums = new int[str.split(" ").length];
    for (int i = 0; i < str.split(" ").length; i++) {
      nums[i] = Integer.parseInt(str.split(" ")[i]);
    }
    int len = nums[2];
    int up = nums[0];
    int down = nums[1];
    int day = (len - down) / (up - down);
    if ((len - down) % (up - down) != 0) {
      day++;
    }
    System.out.println(day);
  }    
}