public class BinarySearch {

  public static boolean BSearch(int[] arr, int n) {
    int left = 0;
    int right = arr.length - 1;
    int mid;
    while (left <= right) {
      mid = (left + right) / 2;
      if (arr[mid] < n) {
        left = mid + 1;
      } else if (arr[mid] > n) {
        right = mid - 1;
      } else {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(BSearch(new int[]{1, 3, 9, 14, 18, 27}, 9));
  }
}