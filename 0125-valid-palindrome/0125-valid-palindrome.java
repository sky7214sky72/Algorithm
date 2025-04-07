import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        if (sb.toString() == null || sb.toString().equals("")) {
            return true;
        }

        if (sb.toString().equals(new StringBuffer(sb.toString()).reverse().toString())) {
            return true;
        }

        return false;
    }
}