import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] mos = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] letterMos;
        letterMos = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word: letterMos) {
            for (int i = 0; i < mos.length; i++) {
                if (word.equals(mos[i])) sb.append(Character.toString(i + 'a'));
            }            
        }
        return sb.toString();
    }
}