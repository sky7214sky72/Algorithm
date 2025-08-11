import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i=0;i<num;i++) {
           String ar = br.readLine();
           Stack<Character> stack = new Stack<>();
           boolean isValid = true;
           for (int j=0;j<ar.length();j++) {
               char c = ar.charAt(j);
               if (c=='(') {
                   stack.push(c);
               } else {
                   if (stack.empty()) {
                       isValid = false;
                       break;
                   }
                   stack.pop();
               }
           }
           if (isValid && stack.empty()) {
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }
        }
    }
}