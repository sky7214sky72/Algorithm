import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String[] numArr = num.split(" ");
        if (Integer.parseInt(numArr[0]) > Integer.parseInt(numArr[1])) {
            System.out.println(">");
        } else if (Integer.parseInt(numArr[0]) < Integer.parseInt(numArr[1])) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}