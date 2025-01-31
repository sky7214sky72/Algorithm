import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numInt = Integer.parseInt(scan.nextLine());
        String numString = scan.nextLine();
        String[] numArray = numString.split(" ");
        int maxNum = findMax(numArray); // 입력된 숫자 중 최댓값을 찾음
        boolean[] isPrime = sieveOfEratosthenes(maxNum); // 에라토스테네스의 체로 소수 배열 생성
        int primeCount = countPrimes(numArray, isPrime);
        System.out.println(primeCount);
    }

    private static int findMax(String[] numArray) {
        int max = 0;
        for (String num : numArray) {
            int n = Integer.parseInt(num);
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    private static boolean[] sieveOfEratosthenes(int maxNum) {
        boolean[] isPrime = new boolean[maxNum + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님
        for (int i = 2; i * i <= maxNum; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxNum; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    private static int countPrimes(String[] numArray, boolean[] isPrime) {
        int primeCount = 0;
        for (String num : numArray) {
            int n = Integer.parseInt(num);
            if (isPrime[n]) {
                primeCount++;
            }
        }
        return primeCount;
    }
}